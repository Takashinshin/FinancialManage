package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;

@Controller
public class FinacialController {
	
	@Autowired
	private PaymentService service;
	
	//初期画面遷移　& 全件取得
	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("payment", service.select());
		return "home";
	}
	
	//create画面遷移
	@GetMapping("/create")
	public String getCreate(@ModelAttribute Payment payment) {
		return "create";
	}
	

	@PostMapping("/create")
	public String create(@Validated @ModelAttribute Payment payment, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "create";
		}
		service.insert(payment);
		return "redirect:/";
	}

}
