package com.pavan.beans;

import org.springframework.stereotype.Component;

@Component(value = "java")

public class JavaCourse implements ICourse {

	static
	{
		System.out.println("Java course .class file is loading.....\n");
	}
		
	public JavaCourse() {
		System.out.println("Java Course Zero Param Constructor got called.....\n");
	}

	@Override
	public String courseContent() {
		System.out.println("Java Course Content Method Got Called.....\n");
		return "1. Opps 2. Collections 3. Exception Handling.....\n";
	}

	@Override
	public float price() {
		
		return 500;
	}

}
