package com.test.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.repository.DbImplement;

@Controller
public class UserController {

	@Autowired
	private DbImplement dbimplement;
	
	@GetMapping("/deposit")
	public String deposit() throws SQLException {
		
		return "deposit";
	}
	@GetMapping("/withdraw")
	public String withdraw() throws SQLException {
		
		return "withdraw";
	}
	@GetMapping("/transfer")
	public String transfer() throws SQLException {
		
		return "transfer";
	}

	@GetMapping("/userloggedin")
	public String AdminLogin() throws SQLException {
		
		return "usermenu";
		
	}
	@GetMapping("/accdeposit")
	public String accdeposit(@RequestParam("accno") String accno,@RequestParam("amount") double balance,Model model) throws SQLException {
		boolean st=dbimplement.accdeposit(accno,balance);
		if(st) {
			model.addAttribute("msg1","Deposit Successful");
			return "usermenu";
		}else {
			model.addAttribute("msg1","Account Doesn't exist");
			return "deposit";
		}	
		
		
	}
	@GetMapping("/accwithdraw")
	public String accwithdraw(@RequestParam("accno") String accno,@RequestParam("amount") double balance,Model model) throws SQLException {
		boolean st=dbimplement.accwithdraw(accno,balance);
		if(st) {
			model.addAttribute("msg1","Withdrawal Successful");
			return "usermenu";
		}else {
			model.addAttribute("msg1","Account Doesn't exist");
			return "withdraw";
		}	
		
	}
	
	@GetMapping("/acctransfer")
	public String acctransfer(@RequestParam("accno1") String accno1,@RequestParam("accno2") String accno2,@RequestParam("balance") double balance,Model model) throws SQLException {
		boolean st=dbimplement.acctransfer(accno1,accno2,balance);
		if(st) {
			model.addAttribute("msg1","Transfer Successful");
			return "usermenu";
		}else {
			model.addAttribute("msg1","Check the Acc No");
			return "transfer";
		}	
		
	}
}
