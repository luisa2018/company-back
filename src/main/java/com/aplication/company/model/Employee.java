package com.aplication.company.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "test")
@Access(AccessType.FIELD)
public class Employee extends ParentEmployee {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4662795531839123986L;

	@Column(name ="name", nullable = false, length = 30)
	private String employeeName;
	
	@Column(name ="position", nullable = false, length = 30)
	private String jobPosition; 
	
	@Column(name ="salary", nullable = false, length = 30)
	private String salary ;
	

	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	
	
	

}
