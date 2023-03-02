package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Family;
import com.example.demo.repository.Repository;

@Service
public class ApiService {
	@Autowired
	Repository repo;
	
	public String updateDetails(Family fm) {
		repo.save(fm);
		return "Updated";
	}
	
	public String deleteDetails(int id) {
		repo.deleteById(id);
		return "Deleted";
	}

}
