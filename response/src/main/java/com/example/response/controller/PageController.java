package com.example.response.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.response.dto.User;

@Controller
public class PageController {

	@RequestMapping("/main")
	public String main() {
		return "main.html";
	}
	
	@ResponseBody
	@GetMapping("/user")
	public User user() {
		User user = new User();
		user.setName("홍길동");
		user.setAddress("패스트캠퍼스");
		return user;
	}
}
