package com.nr.springbootcrudexample.service;

import com.nr.springbootcrudexample.entity.Employee;
import com.nr.springbootcrudexample.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee, Integer empId) {
        employee.setId(empId);
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        return employeeRepo.findById(empId).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void deleteEmployeeById(Integer empId) {
        employeeRepo.deleteById(empId);
    }
}
