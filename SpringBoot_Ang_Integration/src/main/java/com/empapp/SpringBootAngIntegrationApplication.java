package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.entities.Employee;
import com.empapp.services.EmployeeService;

@SpringBootApplication
public class SpringBootAngIntegrationApplication implements CommandLineRunner{

	@Autowired
	private EmployeeService empService;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngIntegrationApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//empService.save(new Employee("ani", 22));
		//empService.save(new Employee("ram", 50));
		//empService.save(new Employee("baby", 10));
		//empService.save(new Employee("eshu", 45));	
		
	}

}