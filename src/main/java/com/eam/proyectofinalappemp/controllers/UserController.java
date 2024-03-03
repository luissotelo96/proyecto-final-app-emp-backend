package com.eam.proyectofinalappemp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eam.proyectofinalappemp.models.User;
import com.eam.proyectofinalappemp.repositories.IUserRepository;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserRepository userRepository;

	@GetMapping("register")
	public String showRegisterForm(User user, Model model) {
		return "registerform";
	}

	@GetMapping("login")
	public String showLoginForm(User user, Model model) {
		return "loginform";
	}

	@PostMapping("")
	public String registerUser(User user) {
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getAddress());
		return "loginform";
	}

}
