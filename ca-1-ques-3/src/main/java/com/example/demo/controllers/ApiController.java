package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FamilyOne;
import com.example.demo.repository.Repository;

@RestController
public class ApiController {
	@Autowired
	Repository repo;
	
	@GetMapping("/get")
	List<FamilyOne> getFamilyDetails() {
		return repo.findAll();
	}

}
