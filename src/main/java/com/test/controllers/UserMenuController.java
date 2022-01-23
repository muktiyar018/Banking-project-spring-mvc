package com.test.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.bean.Displaypojo;
import com.test.repository.DbImplement;

@Controller
public class UserMenuController {

	@Autowired
	private DbImplement dbimplement;
	@GetMapping("/displaycust")
	public String displaycust(Model model,HttpSession session,HttpServletRequest req) throws SQLException {
		session=req.getSession();
		String custid=(String)session.getAttribute("custid");
		System.out.println(custid);
		List<Displaypojo> customers=dbimplement.displaycustdata(custid);
		System.out.println(customers);
		model.addAttribute("customers",customers);
		return "displaycust";
	}
	
}
