package com.accenture.cb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.cb.demo.model.Customer;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("customer", new Customer());
		return "WEB-INF/views/home.jsp";
	}
}
