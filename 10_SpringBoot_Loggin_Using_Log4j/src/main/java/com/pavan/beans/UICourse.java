package com.pavan.beans;


public class UICourse implements ICourse {
	static
	{
		System.out.println("UICourse .class file is loading.....\n");
	}
		
	public UICourse() {
		System.out.println("UICourse Zero Param Constructor got called.....\n");
	}

	@Override
	public String courseContent() {
		System.out.println("UICourse Content Method Got Called.....\n");
		return "1. HTML 2. CSS 3.  JavaScript 4. React Js.....\n";
	}

	@Override
	public float price() {
		
		return 600;
	}


}
