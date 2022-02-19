package com.aplication.company.controller;

import java.io.IOException;
import java.util.List;

import org.apache.tools.ant.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.aplication.company.model.EntityEmployee;
import com.aplication.company.service.EmployeeService;
import com.aplication.company.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "*")
@RestController
public class EmployeeController {

	@Autowired
	protected EmployeeService employeService;
	protected ObjectMapper mapper;

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String employeeJson)
			throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Ingreso metodo seva");
		this.mapper = new ObjectMapper();
		EntityEmployee employee = this.mapper.readValue(employeeJson, EntityEmployee.class);

		if (!this.validate(employee)) {
			System.out.println("Falla metodo seva");
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Required fields are not filled out");
		}
		this.employeService.save(employee);
		System.out.println("Exito metodo seva 2");
		return new RestResponse(HttpStatus.OK.value(), "Successful operation");

	}

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public List<EntityEmployee> getEmployee() {
		System.out.println("getemployee ingreso");
		return this.employeService.findAll();
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteEmployee(@RequestBody String employeJson) throws Exception {
		System.out.println("getemployee ingreso DELETE");
		this.mapper = new ObjectMapper();
		EntityEmployee employee = this.mapper.readValue(employeJson, EntityEmployee.class);

		if (employee.getId() == null) {
			throw new Exception("El id esta nulo");
		}
		this.employeService.deleteEmployee(employee.getId());
	}

	private boolean validate(EntityEmployee employee) {
		boolean isValid = true;

		if (StringUtils.trimToNull(employee.getEmployeeFirstName()) == null) {
			isValid = false;
		}
		if (StringUtils.trimToNull(employee.getEmployeeFirstSurname()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(employee.getEmployeeJobPosition()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(employee.getEmployeeSalary()) == null) {
			isValid = false;
		}

		return isValid;
	}

}
