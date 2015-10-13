package com.accenture.cb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accenture.cb.demo.model.Customer;
import com.accenture.cb.demo.service.RabbitService;

@Controller

public class FinalController  {
	
	@Autowired RabbitService rabbitService;
	
    @RequestMapping(value = "/save", method=RequestMethod.POST)
    public String saveCust(Model model, Customer customer) {
		rabbitService.sendToRabbit(customer);
		return "WEB-INF/views/finalPage.jsp";
	}

}
