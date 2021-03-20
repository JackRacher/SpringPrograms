package com.ojas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
@SpringBootApplication
public class SpringProgramsApplication{
	@Autowired
	static JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
//		ApplicationContext ctx = 
		SpringApplication.run(SpringProgramsApplication.class, args);
//		display();
//		
//		Hello h = (Hello) ctx.getBean("Hi");
//		System.out.println(h.getMessage());
//		
//		Hello h1 = (Hello) ctx.getBean("Hi");
//		System.out.println(h1.getMessage());
		jdbcTemplate.update("create table Demoooo(id varchar(20), jname varchar(20))");
		System.out.println("Created successfully");
		
	}
	
	public static void display() {
		System.out.println("Welcome to Springs.");
		
	}

	

}
