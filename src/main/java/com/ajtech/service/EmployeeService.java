package com.ajtech.service;

import com.ajtech.entity.Department;
import com.ajtech.entity.Employee;
import com.ajtech.repository.DepartmentRepository;
import com.ajtech.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public void createDepartmentWithEmployees() {
        Department department = new Department();
        department.setName("HR");
        departmentRepository.save(department);

        Employee emp1 = null;
        emp1.setName("ajtech");
        emp1.setSalary(50000);
        emp1.setDept(department.getName());
        employeeRepository.save(emp1);
    }
}
