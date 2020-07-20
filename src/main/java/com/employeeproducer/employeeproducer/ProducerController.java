package com.employeeproducer.employeeproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@GetMapping(value = "/ProducerController/employee" , produces = "application/json")
	public Employee getEmployee()
	{
		return new Employee("jamil","5435345");
	}
	
}
