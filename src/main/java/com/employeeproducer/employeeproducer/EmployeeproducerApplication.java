package com.employeeproducer.employeeproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeproducerApplication.class, args);
	}

}
