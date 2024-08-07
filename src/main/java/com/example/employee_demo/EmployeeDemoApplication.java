package com.example.employee_demo;

import com.example.employee_demo.Employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeDemoApplication {

	private static EmployeeService employeeService;

	@Autowired
	public EmployeeDemoApplication(EmployeeService employeeService){
		this.employeeService = employeeService;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDemoApplication.class, args);
		employeeService.employeeList();
	}

}
