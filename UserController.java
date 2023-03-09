package com.Humancloud.HealthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Humancloud.HealthCare.entity.User;
import com.Humancloud.HealthCare.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/user")
	public User registerUser(@RequestBody User user) {
		return this.service.registerUser(user);
	}

}