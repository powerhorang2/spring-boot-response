package com.example.response.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	// TEXT
	@GetMapping("/text")
	public String text(@RequestParam String account) {
		return account;
	}
	
}
