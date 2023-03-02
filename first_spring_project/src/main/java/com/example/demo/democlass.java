package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democlass {
	@GetMapping ("/democlass")
	public String Demonew() {
		return "This is the demo class";
	}

}
