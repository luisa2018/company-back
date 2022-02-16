package com.aplication.company.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplication.company.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@SuppressWarnings("unchecked")
	Employee save(Employee employee);
	
	List<Employee> findAll();
	

}
