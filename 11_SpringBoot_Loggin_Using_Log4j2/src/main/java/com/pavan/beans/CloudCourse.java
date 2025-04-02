package com.pavan.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="cloudCourse")

public class CloudCourse implements ICourse {
	private Logger logger = LoggerFactory.getLogger(CloudCourse.class);
	static
	{
		System.out.println("CloudCourse .class file is loading.....\n");
	}
		
	public CloudCourse() {
		System.out.println("CloudCourse Zero Param Constructor got called.....\n");
	}

	@Override
	public String courseContent() {
		System.out.println("Control entering into CloudCourse CourseContent methods.....");
		System.out.println("CloudCourse Content Method Got Called.....\n");
		return "1.Docker 2. Kubernates 3.  Azure 4. AWS.....\n";
	}

	@Override
	public float price() {
		
		return 700;
	}

}
