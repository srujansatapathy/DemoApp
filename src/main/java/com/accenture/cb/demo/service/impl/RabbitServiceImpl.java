package com.accenture.cb.demo.service.impl;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.cb.demo.model.Customer;
import com.accenture.cb.demo.service.RabbitService;

public class RabbitServiceImpl implements RabbitService {
	
    @Autowired AmqpTemplate amqpTemplate;
    @Autowired AmqpAdmin amqpAdmin;

	public String sendToRabbit(Customer customer) {
		
	    String firstName = customer.getFirstName();
	    String lastName = customer.getLastName();
		String queueName = firstName + "::" + lastName;

		amqpAdmin.declareQueue(new Queue(queueName , true));
		amqpTemplate.convertAndSend(queueName, "OK");
		
		return "OK" ;
	}

}
