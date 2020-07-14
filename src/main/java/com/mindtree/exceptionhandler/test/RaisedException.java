package com.mindtree.exceptionhandler.test;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.mindtree.exceptionhandler.annotation.HandleException;
import com.mindtree.exceptionhandler.annotation.HandleExceptions;
import com.mindtree.exceptionhandler.exception.FileNotExistException;
import com.mindtree.exceptionhandler.exception.UserNotExistException;
import com.mindtree.exceptionhandler.model.Content;
import com.mindtree.exceptionhandler.model.ErrorSchema;
import com.mindtree.exceptionhandler.model.Event;

@Component
public class RaisedException {

    @HandleExceptions({
        @HandleException(exceptionType = FileNotExistException.class, handlers = {
            "defaultExceptionHandler"}),
        @HandleException(exceptionType = UserNotExistException.class, handlers = {
            "kafkaExceptionHandler"})
    })
    public Integer testExceptionOne(int type) {
        if (type == 0) {
        	ErrorSchema errorSchema = new ErrorSchema();
        	Content content = new Content();
        	content.setErrorCode("1001");
        	content.setErrorMessage("The method has not been implemented");
        	content.setErrorType("HTTP:METHOD_NOT_ALLOWED");
        	Event event = new Event();
        	event.setAppName("testApp");
        	event.setAppVersion("1.0");
        	event.setContent(content);
        	event.setCorrelationId("7c03c820-7fcc-11ea-b05f-005056be6754");
        	event.setEnvironment("dev");
        	event.setTimestamp((int) new Date().getTime());
        	event.setTraceId("7c03c820-7fcc-11ea-b05f-005056be6754");
        	errorSchema.setEvent(event);
        	errorSchema.setSourcetype("exceptionhandler");
            throw new FileNotExistException(errorSchema);
        } else if (type == 1) {
        	ErrorSchema errorSchema = new ErrorSchema();
        	Content content = new Content();
        	content.setErrorCode("1001");
        	content.setErrorMessage("The method has not been implemented");
        	content.setErrorType("HTTP:METHOD_NOT_ALLOWED");
        	Event event = new Event();
        	event.setAppName("testApp");
        	event.setAppVersion("1.0");
        	event.setContent(content);
        	event.setCorrelationId("7c03c820-7fcc-11ea-b05f-005056be6754");
        	event.setEnvironment("dev");
        	event.setTimestamp((int) new Date().getTime());
        	event.setTraceId("7c03c820-7fcc-11ea-b05f-005056be6754");
        	errorSchema.setEvent(event);
        	errorSchema.setSourcetype("exceptionhandler");
        	
            throw new UserNotExistException(errorSchema);
            
        } else {
            throw new RuntimeException("General Runtime  Exception");
        }
    }

    @HandleException(handlers = {"fileExceptionHandler",
        "defaultExceptionHandler", "logExceptionHandler"})
    public void testExceptionTwo() {
        throw new RuntimeException("Io Exception");
    }

    @HandleException(handlers = {"defaultExceptionHandler"})
    public void testExceptionThree(){
        throw new UserNotExistException("User not exist Exception");
    }
    
}
