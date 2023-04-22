package com.nr.springbootcrudexample.service;

import com.nr.springbootcrudexample.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee, Integer empId);
    Employee getEmployeeById(Integer empId);
    List<Employee> getAllEmployees();

    void deleteEmployeeById(Integer empId);
}
