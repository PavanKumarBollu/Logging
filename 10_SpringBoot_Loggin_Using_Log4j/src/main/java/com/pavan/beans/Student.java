package com.pavan.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Logger logger = LoggerFactory.getLogger(Student.class);
	
	
	@Autowired
	@Qualifier("courseId")
	private ICourse course;

	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student:: Zero param constructor...");
	}
	
	
	
	public void examPreparation(String examName)
	{
		logger.debug("Control entering into Student Exampreparation  method.....");
		System.out.println("Student Class ExamPreparation Method Got Called .....\n");
		System.out.println("subject Selected Is : " + course.getClass().getName() + ".....\n");
		
		
		String courseContent = course.courseContent();
		System.out.println("Course Content is : " + courseContent + ".....\n");
		
		float price = course.price();
		System.out.println("Course Price is : " + price + ".....\n");
		
	}



	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	

}
