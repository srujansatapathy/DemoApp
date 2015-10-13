package com.accenture.cb.demo.service;

import com.accenture.cb.demo.model.Customer;

public interface RabbitService {
	
	public String sendToRabbit(Customer customer);

}
