package com.mindtree.exceptionhandler.exception;

import com.mindtree.exceptionhandler.annotation.Handlers;
import com.mindtree.exceptionhandler.model.ErrorSchema;


@Handlers({"defaultExceptionHandler"})
public class UserNotExistException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3772900345779027149L;
	
	public UserNotExistException(RuntimeException e) {
		super(e);
	}
	
	public UserNotExistException(String msg) {
		super(msg);
	}
	
	public UserNotExistException(ErrorSchema msg) {
		super(msg);
	}

}
