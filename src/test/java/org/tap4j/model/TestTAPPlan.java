/*
 * The MIT License
 * 
 * Copyright (c) 2010 tap4j team (see AUTHORS)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.tap4j.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Bruno P. Kinoshita - http://www.kinoshita.eti.br
 * @since 1.0
 */
public class TestTAPPlan {

    protected Plan simplePlan;

    protected Plan skipAllPlan;

    protected final static Integer INITIAL_TEST_NUMBER = 1;

    protected final static Integer LAST_TEST_NUMBER = 3;

    protected final static String EXPECTED_OUTPUT = "1..3 # Plan's comment.";

    protected final static String REASON = "Function not yet implemented.";

    @Before
    public void setUp() {
        simplePlan = new Plan(INITIAL_TEST_NUMBER, LAST_TEST_NUMBER);
        simplePlan.setComment(new Comment("Plan's comment."));
        SkipPlan skip = new SkipPlan(REASON);
        skipAllPlan = new Plan(LAST_TEST_NUMBER, skip);
    }

    @Test
    public void testSimplePlan() {
        Assert.assertTrue(simplePlan != null);

        Assert.assertEquals(simplePlan.getInitialTestNumber(),
                INITIAL_TEST_NUMBER);

        Assert.assertEquals(simplePlan.getLastTestNumber(), LAST_TEST_NUMBER);

        Assert.assertNull(simplePlan.getSkip());

        Assert.assertFalse(simplePlan.isSkip());

        Assert.assertNotNull(simplePlan.getComment());
    }

    @Test
    public void testSkipAllPlan() {
        Assert.assertTrue(skipAllPlan != null);

        Assert.assertEquals(skipAllPlan.getInitialTestNumber(),
                INITIAL_TEST_NUMBER);

        Assert.assertEquals(skipAllPlan.getLastTestNumber(), LAST_TEST_NUMBER);

        Assert.assertTrue(skipAllPlan.isSkip());

        Assert.assertNotNull(skipAllPlan.getSkip());

        Assert.assertEquals(skipAllPlan.getSkip().getReason(),
                TestTAPPlan.REASON);

        skipAllPlan = new Plan(skipAllPlan.getInitialTestNumber(),
                skipAllPlan.getLastTestNumber(), skipAllPlan.getSkip());

        Assert.assertNotNull(skipAllPlan);

        Assert.assertNotNull(skipAllPlan.getSkip());

        Assert.assertEquals(skipAllPlan.getSkip().getReason(), REASON);
    }

    @Test
    public void testSkip() {
        SkipPlan skip = skipAllPlan.getSkip();

        Assert.assertEquals(skip.getReason(), REASON);
    }

}
