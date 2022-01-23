package com.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeConroller {

	
	@GetMapping("/userlogin")
	public String UserLogin() {
		System.out.println("In User Controleler");
		return "userlogin";
	}
	@GetMapping("/adminlogin")
	public String AdminLogin() {
		System.out.println("In admin Controleler");
		return "adminlogin";
	}
}
