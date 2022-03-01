package com.aplication.company.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.company.dao.EmployeeRepository;
import com.aplication.company.model.EntityEmployee;

@Service
public class EmployeeServiceImplement implements EmployeeService {
	
	@Autowired
	protected EmployeeRepository employeeRepository;

	@Override
	public EntityEmployee save(EntityEmployee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public List<EntityEmployee> findAll() {
		return this.employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(Long id) {
		this.employeeRepository.deleteById(id);
		
	}
	

	
}
