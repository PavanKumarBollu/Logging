package com.pavan.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value = "java")

public class JavaCourse implements ICourse {
	
	private Logger logger = LoggerFactory.getLogger(JavaCourse.class);

	static
	{
		System.out.println("Java course .class file is loading.....\n");
	}
		
	public JavaCourse() {
		System.out.println("Java Course Zero Param Constructor got called.....\n");
	}

	@Override
	public String courseContent() {
		logger.debug("Control entering into JavaCourse CourseContent methods.....");
		System.out.println("Java Course Content Method Got Called.....\n");
		return "1. Opps 2. Collections 3. Exception Handling.....\n";
	}

	@Override
	public float price() {
		
		return 500;
	}

}
