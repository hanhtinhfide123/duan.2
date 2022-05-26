package com.watch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.watch.entity.Account;
import com.watch.entity.Product;
import com.watch.service.AccountService;



@Controller
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/security/login2/form")
	public String loginForm( Model model) {
		model.addAttribute("message","vui long dang nhap");
		return "security/login2";
	}
	@GetMapping("/account/register")
	public String register(Model model) {
		Account account = new Account();
		model.addAttribute("form", account);
		return "security/login";
	}
	

}
