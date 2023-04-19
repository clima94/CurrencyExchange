package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CurrencyExchangeController {
	
	@RequestMapping("/home")
	public String getHomePage() {
		return "home";
	}
}
