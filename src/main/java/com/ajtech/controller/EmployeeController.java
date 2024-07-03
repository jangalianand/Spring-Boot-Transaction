package com.ajtech.controller;

import com.ajtech.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/create-employees")
    public String createDepartmentWithEmployees() {
        try {
            employeeService.createDepartmentWithEmployees();
        } catch (RuntimeException e) {
            return "Transaction rolled back due to: " + e.getMessage();
        }
        return "Department and employees created successfully";
    }
}

