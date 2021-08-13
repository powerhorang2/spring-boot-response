package com.example.response.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {

	// TEXT
	@GetMapping("/text")
	public String text(@RequestParam String account) {
		return account;
	}
	
	// JSON
	// request -> object mapper -> object -> method -> object -> object mapper -> json -> response
	@PostMapping("/json")
	public User json(@RequestBody User user) {
		return user;
	}
	
}
