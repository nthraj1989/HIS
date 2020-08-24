package com.razz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.razz.model.User;
import com.razz.service.UserDtlsServiceImpl;



@Controller
public class UserDtlsController {

	@Autowired
	UserDtlsServiceImpl userservice;
	
	@GetMapping(value = "/")
	public String loadForm(Model model) {
		model.addAttribute("user", new User());
		return "admin";
	}
	
	@PostMapping(value = "/register")
	public String handleSubmitBtn(@ModelAttribute("user") User user, Model model) {
		//System.out.println(user);
		userservice.save(user);
		return "admin";
	}

}
