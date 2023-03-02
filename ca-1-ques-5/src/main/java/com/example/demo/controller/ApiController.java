package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentOne;
import com.example.demo.repository.Repository;

@RestController
public class ApiController {
	@Autowired
	Repository repo;
	
	@GetMapping("/get")
	List<StudentOne> getAll() {
		return repo.findAll();
	}
	
	@PostMapping("/post")
	StudentOne Create(@RequestBody StudentOne stu) {
		return repo.save(stu);
	}

}
