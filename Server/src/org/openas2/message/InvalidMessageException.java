package org.openas2.message;

import org.openas2.OpenAS2Exception;


public class InvalidMessageException extends OpenAS2Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMessageException() {
		super();
	}

	public InvalidMessageException(String msg) {
		super(msg);
	}
}
