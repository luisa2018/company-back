package com.aplication.company.service;

import java.util.List;

import com.aplication.company.model.EntityEmployee;

public interface EmployeeService {

	 /**
     * Save a user
     * 
     * @param employee
     * @return the saved employee
     */
	EntityEmployee save(EntityEmployee employee);

    /**
     * get list of employees
     * 
     * @return list of employees
     */
	List<EntityEmployee> findAll();
	
	/**
	 * delete an employee with received id
	 * 
	 * @param id
	 */

	void deleteEmployee(Long id);
}
