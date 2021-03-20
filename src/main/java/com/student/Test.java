package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test implements CommandLineRunner{

	@Autowired
	ApplicationContext cxt;
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student s = cxt.getBean(Student.class);
//		s.setSno(10);
//		s.setSname("Ram");
//		
//		Course c = cxt.getBean(Course.class);
//		c.setCid(100);
//		c.setCname("Java");
//		c.setFee(20000.00);
//		c.setStud(s);
		
		StudentConfig  sc = cxt.getBean(StudentConfig.class);
		sc.studentBean().setSno(100);
		sc.studentBean().setSname("Ram");
		sc.studentBean().setCity("Hyderabad");
		sc.courseBean().setCid(10);
		sc.courseBean().setCname("Python");
		sc.courseBean().setFee(2000.98);
		sc.courseBean().setStud(sc.studentBean());
		System.out.println(sc.courseBean().toString());
	}
}
