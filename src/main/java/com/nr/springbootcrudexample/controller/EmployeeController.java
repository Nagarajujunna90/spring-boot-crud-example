package com.nr.springbootcrudexample.controller;

import com.nr.springbootcrudexample.entity.Employee;
import com.nr.springbootcrudexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllEmployee() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        if (employeeList.stream().findAny().isPresent())
            return new ResponseEntity<>(employeeList, HttpStatus.OK);
        else {
            return new ResponseEntity<>("No data found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{empId}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("empId") Integer empId) {
        Employee employeeById = employeeService.getEmployeeById(empId);
        if (employeeById != null) return new ResponseEntity<>(employeeService.getEmployeeById(empId), HttpStatus.OK);
        else return new ResponseEntity<>("No Data found with given Id", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/{empId}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable("empId") Integer empId) {
        employeeService.deleteEmployeeById(empId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/{empId}")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee, @PathVariable("empId") Integer empId) {
        Employee updateEmployee = employeeService.updateEmployee(employee, empId);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
}
