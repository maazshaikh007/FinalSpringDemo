package com.maaz.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MainConfig.class);
		
		Employee emp = context.getBean("hdfcEmployee",Employee.class);
		
		System.out.println(emp.getCompanyName());
		System.out.println( emp.getROI());
		
		context.close();

	}

}
