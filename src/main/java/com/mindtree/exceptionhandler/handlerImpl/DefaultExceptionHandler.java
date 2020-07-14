package com.mindtree.exceptionhandler.handlerImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.mindtree.exceptionhandler.exception.BaseException;
import com.mindtree.exceptionhandler.handler.IExceptionHandler;
import com.mindtree.exceptionhandler.model.ErrorSchema;

@Component
public class DefaultExceptionHandler implements IExceptionHandler<BaseException> {
	private static final Log LOGGER = LogFactory
            .getLog(DefaultExceptionHandler.class);
	
	@Override
	public void handleException(final BaseException baseException) {
		final ErrorSchema errorSchema = baseException.getErrorSchema();
		if(errorSchema != null) { 
			LOGGER.info(errorSchema);
		}
		System.out.println("I am specific to default Handler exception");
	}
}
