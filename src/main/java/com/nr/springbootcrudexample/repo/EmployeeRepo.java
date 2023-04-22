package com.nr.springbootcrudexample.repo;

import com.nr.springbootcrudexample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo  extends JpaRepository<Employee,Integer> {
}
