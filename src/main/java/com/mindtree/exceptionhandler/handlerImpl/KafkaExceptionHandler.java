package com.mindtree.exceptionhandler.handlerImpl;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.exceptionhandler.connector.KafkaConnector;
import com.mindtree.exceptionhandler.exception.BaseException;
import com.mindtree.exceptionhandler.handler.IExceptionHandler;
import com.mindtree.exceptionhandler.model.ErrorSchema;


@Component
public class KafkaExceptionHandler implements IExceptionHandler<BaseException> {
	
	@Autowired
	KafkaConnector kafkaConnector;
	
	@Override
	public void handleException(final BaseException baseException) {
		//final ErrorMessage errorMsg = baseException.getErrorMessage();
		final ErrorSchema errorSchema = baseException.getErrorSchema();
		if(errorSchema != null) {
			//ObjectMapper mapper = new ObjectMapper();
			//mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
			try {
				//String json = mapper.writeValueAsString(errorSchema.toString());
				//System.out.println("Sending Message to Kafka : "+json);
				kafkaConnector.kafkaMessageSender(errorSchema.toString());
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I am specific to kafka Handler exception");
		} else {
			System.out.println("I am specific to kafka Handler exception..");
		}
	}
}
