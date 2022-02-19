package com.aplication.company.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplication.company.model.EntityEmployee;


public interface EmployeeRepository extends JpaRepository<EntityEmployee, Long>{
	
	@SuppressWarnings("unchecked")
	EntityEmployee save(EntityEmployee employee);
	
	List<EntityEmployee> findAll();
	

}
