package com.mdp.kakfa.mdpconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KaftaConsumer {

	@KafkaListener(topics = "monty", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message" + message);
	}
	
	
	@KafkaListener(topics = "userjsonmessage", groupId = "group_json", containerFactory="userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed json message" + user);
	}
	
}
