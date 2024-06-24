package com.example.deploy.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployWeb {
	
	@GetMapping("/")
	public String hello_world() {
		
		return "Hello World"; 
	}
	
	

}
