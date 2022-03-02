package com.aplication.company.controller;

import com.aplication.company.model.EntityEmployee;
import com.aplication.company.service.EmployeeService;
import com.aplication.company.util.RestResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class EmployeeControllerTest {
    @Mock
    EmployeeService employeeService;
    @Mock
    ObjectMapper mapper;
    @InjectMocks
    EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSaveOrUpdate() throws IOException {
        when(employeeService.save(any())).thenReturn(new EntityEmployee());
        when(mapper.readValue(anyString(),eq(EntityEmployee.class))).thenReturn(new EntityEmployee());

        RestResponse result = employeeController.saveOrUpdate("{ \"id\": \"\", \"employeeFirstName\": \"pedro\", \"employeeSecondName\": \"\", \"employeeFirstSurname\": \"Rueda\", \"employeeSecondSurname\": \"Suarez\", \"employeeJobPosition\": \"manager\", \"employeeSalary\": \"2500000\", \"employeePhone\": \"320863333\", \"employeeManagerId\":\"\" }");
        Assertions.assertEquals(200, result.getResponseCode());
    }

    @Test
    void testSaveOrUpdateValidateFirstName() throws IOException {
        when(employeeService.save(any())).thenReturn(new EntityEmployee());
        when(mapper.readValue(anyString(),eq(EntityEmployee.class))).thenReturn(new EntityEmployee());

        RestResponse result = employeeController.saveOrUpdate("{ \"id\": \"\", \"employeeFirstName\": null, \"employeeSecondName\": \"\", \"employeeFirstSurname\": \"Rueda\", \"employeeSecondSurname\": \"Suarez\", \"employeeJobPosition\": \"manager\", \"employeeSalary\": \"2500000\", \"employeePhone\": \"320863333\", \"employeeManagerId\":\"\" }");
        Assertions.assertEquals(406, result.getResponseCode());
    }

    @Test
    void testSaveOrUpdateValidateFirstSurName() throws IOException {
        when(employeeService.save(any())).thenReturn(new EntityEmployee());
        when(mapper.readValue(anyString(),eq(EntityEmployee.class))).thenReturn(new EntityEmployee());

        RestResponse result = employeeController.saveOrUpdate("{ \"id\": \"\", \"employeeFirstName\": \"pedro\", \"employeeSecondName\": \"\", \"employeeFirstSurname\": null, \"employeeSecondSurname\": \"Suarez\", \"employeeJobPosition\": \"manager\", \"employeeSalary\": \"2500000\", \"employeePhone\": \"320863333\", \"employeeManagerId\":\"\" }");
        Assertions.assertEquals(406, result.getResponseCode());
    }

    @Test
    void testGetEmployee() {
        when(employeeService.findAll()).thenReturn(Arrays.<EntityEmployee>asList(new EntityEmployee()));

        List<EntityEmployee> result = employeeController.getEmployee();
        Assertions.assertEquals(Arrays.<EntityEmployee>asList(new EntityEmployee()), result);
    }

    @Test
    void testDeleteEmployee() throws Exception {
        employeeController.deleteEmployee("employeJson");
    }


}

