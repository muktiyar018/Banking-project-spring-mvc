package com.test.controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.repository.DbImplement;


@Controller
public class AdminController {

	@Autowired
	private DbImplement dbimplement;
	
	@GetMapping("/adminlogged")
	public String AdminLogin(@RequestParam("aid") String aid,@RequestParam("apass") String apass,Model model) throws SQLException {
		boolean st=dbimplement.adminlog(aid, apass);
		if(st) {
			model.addAttribute("msg2","logged in successfully");
		return "adminmenu";}
		else {
		model.addAttribute("msg2","Incorrect login");
			return "adminlogin";}
		
	}
	@GetMapping("/userlogged")
	public String UserLogin(@RequestParam("uid") String uid,@RequestParam("upass") String upass,Model model,HttpSession session,HttpServletRequest req) throws SQLException {
		boolean st=dbimplement.userlog(uid, upass);
		session=req.getSession();
		session.setAttribute("custid", uid);
		if(st) {
			model.addAttribute("msg1","logged in successfully");
		return "usermenu";}
		else {
			model.addAttribute("msg1","Incorrect login");
			return "userlogin";}
		
	}
	@GetMapping("/adminloggedin")
	public String AdminLogin() throws SQLException {
		
		return "adminmenu";
		
	}
	
	@GetMapping("/accclosed")
	public String accclosed(@RequestParam("accno") String accno,Model model) throws SQLException {
		boolean st=dbimplement.accclosed(accno);
		if(st) {
			model.addAttribute("msg","Deleted Successfully");
			return "adminmenu";
		}else {
			model.addAttribute("msg","Account Doesn't exist");
			return "closeacc";
		}	
	}
	
	@GetMapping("/accopened")
	public String accopened(@RequestParam("accno") String accno,@RequestParam("custid") String custid,@RequestParam("acctype") String acctype,@RequestParam("balance") double balance,Model model) throws SQLException {
		boolean st=dbimplement.accopened(accno,custid,acctype,balance);
		if(st) {
			model.addAttribute("msg","Data Inserted Successfully");
			return "adminmenu";
		}else {
			model.addAttribute("msg","Duplicate Entry");
			return "openacc";
		}	
	}
}
