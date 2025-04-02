package com.pavan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pavan.beans.Student;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Student stdBean = context.getBean(Student.class);
		System.out.println(stdBean + ".....\n");
		
		stdBean.examPreparation("Java");
		
		
		((ConfigurableApplicationContext) context).close();
		
	}

}
