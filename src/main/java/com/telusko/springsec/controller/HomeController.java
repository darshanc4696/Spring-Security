package com.telusko.springsec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	
	
	
	@GetMapping("home")
	public String home(HttpServletRequest req)
	{
		return "Hello, Darshan! "+req.getSession().getId();
	}

}
