package com.mbp.kafka.mbpproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbp.kafka.mbpproducer.model.User;


@RestController
@RequestMapping("/kafka")
public class UserResource {


	@Autowired	
	@Qualifier("kafkaTemplate")
	KafkaTemplate<String, User> kafkaTemplate;
	
    private static final String TOPIC = "monty";
    
	@GetMapping("/publish/{name}")
	public String sendMessage(@PathVariable("name") final String name) {
		kafkaTemplate.send(TOPIC,new User(name,"Full Stack Developer",12000L));
		return "Published succesfully";
	}
}
