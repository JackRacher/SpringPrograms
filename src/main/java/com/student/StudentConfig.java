package com.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean("stud")
	public Student studentBean() {
		return new Student();
	}
	
	@Bean
	public Course courseBean() {
		return new Course();
	}

}
