package com.pavan.beans;

public class Student {
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
	}

}
