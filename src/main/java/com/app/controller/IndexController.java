package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.models.Customer;

@Controller
public class IndexController {

	@ModelAttribute("customer")
	private Customer customer(){
		return new Customer();
	}
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/form")
	public String form(Model model) {
	
		return "form";
	}

	@RequestMapping(value = "addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer) {
	
		System.out.println(customer);
		return "redirect:form";
	}

}
