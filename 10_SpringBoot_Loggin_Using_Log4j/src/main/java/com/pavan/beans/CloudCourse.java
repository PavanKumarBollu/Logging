package com.pavan.beans;

public class CloudCourse implements ICourse {
	static
	{
		System.out.println("CloudCourse .class file is loading.....\n");
	}
		
	public CloudCourse() {
		System.out.println("CloudCourse Zero Param Constructor got called.....\n");
	}

	@Override
	public String courseContent() {
		System.out.println("CloudCourse Content Method Got Called.....\n");
		return "1.Docker 2. Kubernates 3.  Azure 4. AWS.....\n";
	}

	@Override
	public float price() {
		
		return 700;
	}

}
