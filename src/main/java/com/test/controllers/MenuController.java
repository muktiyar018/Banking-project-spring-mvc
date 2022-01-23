package com.test.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.bean.Displaypojo;
import com.test.repository.DbImplement;


@Controller
public class MenuController {

	@Autowired
	private DbImplement dbimplement;
	
	@GetMapping("/openacc")
	public String openacc() throws SQLException {
		
		return "openacc";
	}
	@GetMapping("/display")
	public String display(Model model) throws SQLException {
		List<Displaypojo> customers=dbimplement.displaydata();
		System.out.println(customers);
		model.addAttribute("customers",customers);
		return "display";
	}
	@GetMapping("/closeacc")
	public String closeacc() throws SQLException {
		
		return "closeacc";
	}
}
