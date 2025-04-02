package com.pavan.beans;

public class Student {
	private ICourse course;

	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student:: Zero param constructor...");
	}

}
