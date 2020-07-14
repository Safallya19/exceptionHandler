package com.mindtree.exceptionhandler.exception;

import com.mindtree.exceptionhandler.model.ErrorSchema;

public class BaseException extends RuntimeException {
	private static final long serialVersionUID = 1488638787124982982L;
	protected ErrorSchema errorSchema;
	
	public BaseException(String message){
		super(message);
	}
	public BaseException(Exception rexp){
		super(rexp);
	}
	
	public BaseException(ErrorSchema errorSchema) {
		this.errorSchema = errorSchema;
	}
	
	public ErrorSchema getErrorSchema() {
		return errorSchema;
	}
	
	public void setErrorMessage(ErrorSchema errorSchema) {
		this.errorSchema = errorSchema;
	}
}
