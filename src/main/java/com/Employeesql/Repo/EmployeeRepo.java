package com.Employeesql.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.Employeesql.Enitity.Employee;
@Service
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
