package com.ojas.springJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootConfiguration
public class App implements CommandLineRunner{

	@Autowired
	JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome");
		jdbcTemplate.update("create table demo(id varchar(20), jname varchar(20))");
		System.out.println("Created successfully");
		
	}
	
	public void createTable() {
		jdbcTemplate.update("create table demo(id varchar(20), jname varchar(20))");
		System.out.println("Created successfully");
	}
	


}
