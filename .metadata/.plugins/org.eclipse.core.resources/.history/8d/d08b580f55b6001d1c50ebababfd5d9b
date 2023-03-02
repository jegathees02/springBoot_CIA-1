package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Service.EmployeeService;

@RestController
public class ApiController {
	@Autowired
	EmployeeRepo Repository;
	@Autowired
	EmployeeService sevice;
	
	//get operation
	@GetMapping("/get")
	List<Employee> getList() {
		return Repository.findAll();
	}
	

}