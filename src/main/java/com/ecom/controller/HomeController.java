package com.ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller

public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/product")
	public String product() {
		return "product";
	}
	
	@GetMapping("/details")
	public String details() {
		return "view_pro_detail";
	}
	

}

