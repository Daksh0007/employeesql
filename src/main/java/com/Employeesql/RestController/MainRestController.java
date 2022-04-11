package com.Employeesql.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employeesql.Enitity.Employee;
import com.Employeesql.Repo.EmployeeRepo;


@RestController
public class MainRestController {

	@Autowired
	EmployeeRepo employeeRepo;
	@GetMapping("/")
	public String home() {
		return "WELCOME TO AGRA";
	}
	
	
	@PostMapping("/emp")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
		
	}
	@GetMapping("/emps")
	public List<Employee> getEmployees(){
		return employeeRepo.findAll();
	}
	
}
