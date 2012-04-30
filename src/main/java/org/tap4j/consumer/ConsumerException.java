/* 
 * The MIT License
 * 
 * Copyright (c) 2010 Bruno P. Kinoshita <http://www.kinoshita.eti.br>
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
package org.tap4j.consumer;

import org.tap4j.error.TapException;

/**
 * This exception is thrown by the Tap Parser.
 * 
 * @author Bruno P. Kinoshita <http://www.kinoshita.eti.br>
 * @since 20/09/2010
 */
public class ConsumerException extends TapException {
	private static final long serialVersionUID = 3707603673420544139L;

	/**
	 * Constructor with parameter.
	 * 
	 * @param message
	 *            Exception message.
	 */
	public ConsumerException(String message) {
		super(message);
	}

	/**
	 * Constructor with parameter.
	 * 
	 * @param cause
	 *            Exception cause.
	 */
	public ConsumerException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructor with paramters.
	 * 
	 * @param message
	 *            Exception message.
	 * @param cause
	 *            Exception cause.
	 */
	public ConsumerException(String message, Throwable cause) {
		super(message, cause);
	}

}
