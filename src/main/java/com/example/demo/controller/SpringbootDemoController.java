package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
public class SpringbootDemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/welcome")
	public String helloWorld() {
		return demoService.getMessage();
		
	}
	
	

}
