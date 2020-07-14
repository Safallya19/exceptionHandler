package com.mindtree.exceptionhandler.connector;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.mindtree.kafka.connector.KafkaMessageProcessor;
import com.mindtree.kafka.connector.MindtreeCustomProducer;


@Service
public class KafkaConnector {
	
	 
	
	//@Autowired
	KafkaMessageProcessor kafkaMessageProcessor = new KafkaMessageProcessor();
	
	@MindtreeCustomProducer(topicName = "KAFKA_MINDTREE_ERROR", processingMessage= "Exception Handling Service")
	 public  void kafkaMessageSender(String message) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("pushing messsage to Kafka");
		kafkaMessageProcessor.process(this, message );
		//kafkaTemplate.executeInTransaction(kt -> kt.send("KAFKA_MINDTREE_JSON", message));
		System.out.println("pushing messsage to Kafka is done"); 
	}
	
	
}
