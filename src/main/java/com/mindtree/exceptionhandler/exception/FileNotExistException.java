package com.mindtree.exceptionhandler.exception;

import com.mindtree.exceptionhandler.annotation.Handlers;
import com.mindtree.exceptionhandler.model.ErrorSchema;


@Handlers({"fileExceptionHandler"})
public class FileNotExistException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3772900345779027149L;
	
	public FileNotExistException(RuntimeException e) {
		super(e);
	}
	
	public FileNotExistException(String msg) {
		super(msg);
	}
	
	public FileNotExistException(ErrorSchema msg) {
		super(msg);
	}

}
