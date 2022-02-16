package com.aplication.company.controller;

import java.io.IOException;
import java.util.List;

import org.apache.tools.ant.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aplication.company.model.Employee;
import com.aplication.company.service.EmployeeServicie;
import com.aplication.company.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EmployeeController {

	@Autowired
	protected EmployeeServicie employeService;
	protected ObjectMapper mapper;

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String employeeJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();
		Employee employee = this.mapper.readValue(employeeJson, Employee.class);

		if (!this.validate(employee)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"los campos obligatorios no estan diligenciados");

		}
		this.employeService.save(employee);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");

	}

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public List<Employee> getEmployee() {
		return this.employeService.findAll();
	}

	@RequestMapping(value = "/deleteEmploye", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String employeJson) throws Exception {
		this.mapper = new ObjectMapper();
		Employee employee = this.mapper.readValue(employeJson, Employee.class);

		if (employee.getId() == null) {
			throw new Exception("El id esta nulo");
		}
		this.employeService.deleteEmployee(employee.getId()); 
	}

	private boolean validate(Employee employee) {
		boolean isValid = true;
		if (StringUtils.trimToNull(employee.getEmployeeName()) == null) {
			isValid = false;
		}
		if (StringUtils.trimToNull(employee.getJobPosition()) == null) {
			isValid = false;
		}

		return isValid;
	}

}
