package com.luv2code.springdemo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.utility.MyLogger;

public class HelloSpringApp {


    
	public static void main(String[] args) {
		
		
		

	    
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods on the bean: change the coach to Baseball in configuration file + no change in this code
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		Coach theTTCoach = context.getBean("myTTCoach",Coach.class);
		System.out.println(theTTCoach.getDailyWorkout());
		System.out.println(theTTCoach.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}
