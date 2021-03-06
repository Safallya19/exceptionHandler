package com.mindtree.exceptionhandler.handlerImpl;

import org.springframework.stereotype.Component;

import com.mindtree.exceptionhandler.exception.BaseException;
import com.mindtree.exceptionhandler.handler.IExceptionHandler;
import com.mindtree.exceptionhandler.model.ErrorSchema;

@Component
public class JMSExceptionHandler implements IExceptionHandler<BaseException> {
	@Override
	public void handleException(final BaseException baseException) {
		final ErrorSchema errorSchema = baseException.getErrorSchema();
		if(errorSchema != null) {
			System.out.println("I am JMS Exception Handler.");
		} else {
			System.out.println("I am JMS Exception Handler.");
		}
	}
}
