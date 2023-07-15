package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach theCoach2 = context.getBean("myCoach",Coach.class);
		System.out.println(theCoach);
		System.out.println(theCoach2);
		System.out.println((theCoach==theCoach2)?"Singleton":"Prototype");
		
		context.close();
	}

}
