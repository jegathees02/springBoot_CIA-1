package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;
//	
//	public List<EmployeeModel> getbyNameStartingWith(String prefix) {
//		return repo.findByNameStartingWith(prefix);
//	}
//	public List<EmployeeModel> getbyNameEndingWith(String suffix) {
//		return repo.findByNameEndingWith(suffix);
//	}
//	public List<EmployeeModel>getNameByOr(long id,String dept) {
//		return repo.findNameByIdOrDept(id, dept);
//	}
//	public List<EmployeeModel>getNameByAnd(long id,String dept) {
//		return repo.findNameByIdAndDept(id,dept);
//	}
	
	public List<EmployeeModel>findAllEmployeeByDept(String dept) {
		return repo.findAllEmployeeByDept(dept);
	}
	@Transactional
	public int updateEmployeeSalary(double sal,long id) {
		int result = repo.updateEmployeeSalary(sal, id);
		return result;
	}
	
	@Transactional
	public String deleteEmployeeDetails(long id) {
		repo.deleteEmployeeDetails(id);
		return "Done";
	}
	

}
