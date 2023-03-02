package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	private String name = "Varun Kumar";
	
	@GetMapping("/")
	public String getName() {
		return "Hi "+name;
	}

}
