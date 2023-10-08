package com.example.Assignment4;


import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.model.EmployeeTable;
import com.model.EmployeeTableRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.model")
@EntityScan(basePackages="com.model")
@ComponentScan(basePackages="com.controller")
public class Assignment4Application {
	@Autowired
	EmployeeTableRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(Assignment4Application.class, args);
	}
	@PostConstruct
	public void init() {
		System.out.println("Inside save");
		EmployeeTable a1=new EmployeeTable(1L,"Anbu","Anbu@gmail.com","Chennai");
		EmployeeTable a2=new EmployeeTable(2L,"Balaji","Balaji@gmail.com","Bangalore");
		EmployeeTable a3=new EmployeeTable(3L,"Chandru","Chandru@gmail.com","Pune");
		
		ArrayList<EmployeeTable> accounts=new ArrayList<>();
		accounts.add(a1);accounts.add(a2);accounts.add(a3);
		System.out.println("Before saved");
		accountRepository.saveAll(accounts);
		System.out.println("saved");
		
		
		
		
	}

}

	
	