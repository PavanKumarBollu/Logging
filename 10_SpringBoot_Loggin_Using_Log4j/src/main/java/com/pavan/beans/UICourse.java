package com.pavan.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="uiCourse")
public class UICourse implements ICourse {
	private Logger logger = LoggerFactory.getLogger(UICourse.class);
	static
	{
		System.out.println("UICourse .class file is loading.....\n");
	}
		
	public UICourse() {
		System.out.println("UICourse Zero Param Constructor got called.....\n");
	}

	@Override
	public String courseContent() {
		logger.debug("Control entering into UiCourse CourseContent methods.....");
		System.out.println("UICourse Content Method Got Called.....\n");
		return "1. HTML 2. CSS 3.  JavaScript 4. React Js.....\n";
	}

	@Override
	public float price() {
		
		return 600;
	}


}
