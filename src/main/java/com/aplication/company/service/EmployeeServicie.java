package com.aplication.company.service;

import java.util.List;

import com.aplication.company.model.Employee;

public interface EmployeeServicie  {

	 /**
     * Save a user
     * 
     * @param employee
     * @return the saved employee
     */
	Employee save(Employee employee);

    /**
     * get list of employees
     * 
     * @return list of employees
     */
	List<Employee> findAll();
	
	/**
	 * delete an employee with received id
	 * 
	 * @param id
	 */
	void deleteEmployee(Long id);

	

}
