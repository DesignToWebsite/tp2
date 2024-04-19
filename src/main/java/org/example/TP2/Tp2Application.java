package org.example.TP2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		StudentService studentService = context.getBean(StudentService.class);

		Student student = new Student(1, "John Doe");
		studentService.createStudent(student);

		studentService.displayStudent(1);
	}
}
