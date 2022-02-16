package com.aplication.company.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.company.dao.EmployeeRepository;
import com.aplication.company.model.Employee;

@Service
public class EmployeeServiceImplement implements EmployeeServicie {
	
	@Autowired
	protected EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		return this.employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(Long id) {
		this.employeeRepository.deleteById(id);
		
	}
	

	
}
