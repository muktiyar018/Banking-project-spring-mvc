package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.exceptions.MyException;
import com.test.repository.DbImplement;

@Controller
public class RegisterController {

	@Autowired
	private DbImplement dbimplement;
	@GetMapping("/registeruser")
	public String registeruser(){
		return "userregister";
	}
	
	@GetMapping("/registered")
	public String registered(@RequestParam("uid") String uid,@RequestParam("uname") String uname,
			@RequestParam("dob") String dob,@RequestParam("email") String email,@RequestParam("upass") String upass,Model model){
		
		boolean inserted=dbimplement.insertcust(uid,uname,dob,email,upass);
		if(inserted) {
			model.addAttribute("msg","User Registered Successfully!");
		return "userlogin";}
		else{
			model.addAttribute("msg","Duplicate Entry");
			return "userregister";
		}
		
	}
	@ExceptionHandler(MyException.class)
	public String handleex() {
		System.out.println("In exception handler of register");
		return "userregister";
	}
}
