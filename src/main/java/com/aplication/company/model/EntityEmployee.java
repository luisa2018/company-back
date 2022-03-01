package com.aplication.company.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Access(AccessType.FIELD)
public class EntityEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name ="firstName", nullable = false , length = 30)
	private String employeeFirstName;

	@Column(name ="secondName", length = 30)
	private String employeeSecondName;

	@Column(name ="firstSurname", nullable = false, length = 30)
	private String employeeFirstSurname;

	@Column(name ="secondSurname", length = 30)
	private String employeeSecondSurname;
	
	@Column(name ="jobPosition", nullable = false, length = 30)
	private String employeeJobPosition;

	@Column(name ="salary", nullable = false, length = 30)
	private String employeeSalary;
	
	@Column(name ="phone", length = 30)
	private String employeePhone;

	@Column(name ="managerId")
	private String employeeManagerId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="managerId", insertable=false, updatable=false)
	private EntityEmployee entityEmployee;


	/**
	 * get field @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", unique = true, nullable = false)

	  *
	  * @return id @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", unique = true, nullable = false)

	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * set field @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", unique = true, nullable = false)

	  *
	  * @param id @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", unique = true, nullable = false)

	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * get field @Column(name ="firstName", length = 30)
	 *
	 * @return employeeFirstName @Column(name ="firstName", length = 30)

	 */
	public String getEmployeeFirstName() {
		return this.employeeFirstName;
	}

	/**
	 * set field @Column(name ="firstName", length = 30)
	 *
	 * @param employeeFirstName @Column(name ="firstName", length = 30)

	 */
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	/**
	 * get field @Column(name ="secondName", nullable = false, length = 30)
	 *
	 * @return employeeSecondName @Column(name ="secondName", nullable = false, length = 30)

	 */
	public String getEmployeeSecondName() {
		return this.employeeSecondName;
	}

	/**
	 * set field @Column(name ="secondName", nullable = false, length = 30)
	 *
	 * @param employeeSecondName @Column(name ="secondName", nullable = false, length = 30)

	 */
	public void setEmployeeSecondName(String employeeSecondName) {
		this.employeeSecondName = employeeSecondName;
	}

	/**
	 * get field @Column(name ="firstSurname", nullable = false, length = 30)
	 *
	 * @return employeeFirstSurname @Column(name ="firstSurname", nullable = false, length = 30)

	 */
	public String getEmployeeFirstSurname() {
		return this.employeeFirstSurname;
	}

	/**
	 * set field @Column(name ="firstSurname", nullable = false, length = 30)
	 *
	 * @param employeeFirstSurname @Column(name ="firstSurname", nullable = false, length = 30)

	 */
	public void setEmployeeFirstSurname(String employeeFirstSurname) {
		this.employeeFirstSurname = employeeFirstSurname;
	}

	/**
	 * get field @Column(name ="secondSurname", nullable = false, length = 30)
	 *
	 * @return employeeSecondSurname @Column(name ="secondSurname", nullable = false, length = 30)

	 */
	public String getEmployeeSecondSurname() {
		return this.employeeSecondSurname;
	}

	/**
	 * set field @Column(name ="secondSurname", nullable = false, length = 30)
	 *
	 * @param employeeSecondSurname @Column(name ="secondSurname", nullable = false, length = 30)

	 */
	public void setEmployeeSecondSurname(String employeeSecondSurname) {
		this.employeeSecondSurname = employeeSecondSurname;
	}

	/**
	 * get field @Column(name ="jobPosition", nullable = false, length = 30)
	 *
	 * @return employeeJobPosition @Column(name ="jobPosition", nullable = false, length = 30)

	 */
	public String getEmployeeJobPosition() {
		return this.employeeJobPosition;
	}

	/**
	 * set field @Column(name ="jobPosition", nullable = false, length = 30)
	 *
	 * @param employeeJobPosition @Column(name ="jobPosition", nullable = false, length = 30)

	 */
	public void setEmployeeJobPosition(String employeeJobPosition) {
		this.employeeJobPosition = employeeJobPosition;
	}

	/**
	 * get field @Column(name ="salary", nullable = false, length = 30)
	 *
	 * @return employeeSalary @Column(name ="salary", nullable = false, length = 30)

	 */
	public String getEmployeeSalary() {
		return this.employeeSalary;
	}

	/**
	 * set field @Column(name ="salary", nullable = false, length = 30)
	 *
	 * @param employeeSalary @Column(name ="salary", nullable = false, length = 30)

	 */
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	/**
	 * get field @Column(name ="phone", nullable = false, length = 30)
	 *
	 * @return employeePhone @Column(name ="phone", nullable = false, length = 30)

	 */
	public String getEmployeePhone() {
		return this.employeePhone;
	}

	/**
	 * set field @Column(name ="phone", nullable = false, length = 30)
	 *
	 * @param employeePhone @Column(name ="phone", nullable = false, length = 30)

	 */
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}


	/**
	 * get field @Column(name ="managerId")
	 *
	 * @return employeeManagerId @Column(name ="managerId")

	 */
	public String getEmployeeManagerId() {
		return this.employeeManagerId;
	}

	/**
	 * set field @Column(name ="managerId")
	 *
	 * @param employeeManagerId @Column(name ="managerId")

	 */
	public void setEmployeeManagerId(String employeeManagerId) {
		this.employeeManagerId = employeeManagerId;
	}
}
