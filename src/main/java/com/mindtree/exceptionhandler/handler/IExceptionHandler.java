package com.mindtree.exceptionhandler.handler;


public interface IExceptionHandler<T> {
	
	public void handleException(final T baseException);

}
