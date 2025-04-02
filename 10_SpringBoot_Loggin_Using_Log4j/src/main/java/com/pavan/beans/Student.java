package com.pavan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="student")
public class Student {
	
	@Autowired
	private ICourse course;

	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student:: Zero param constructor...");
	}
	
	
	
	public void examPreparation(String examName)
	{
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
