package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.PaymentService;

@Controller
public class FinacialController {
	
	@Autowired
	private PaymentService service;
	
	
	@GetMapping("")
	public String getHome(Model model) {
		
		model.addAttribute("payment", service.select());
		return "home";
	}

}
