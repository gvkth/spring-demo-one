package com.luv2code.springdemo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.utility.MyLogger;

public class HelloSpringApp {

	// use the classname for the logger, this way you can refactor
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private final static Logger LOGGER2 = Logger.getLogger(MyLogger.class.getName());
    
	public static void main(String[] args) {
		
		try {
            MyLogger.setup();
            LOGGER2.setLevel(Level.ALL);
            LOGGER2.severe("Oh, how are you?");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
        }
		
		// set the LogLevel to Severe, only severe Messages will be written
        LOGGER.setLevel(Level.SEVERE);
        LOGGER.severe("Info Log n");
        LOGGER.warning("Info Log");
        LOGGER.info("Info Log");
        LOGGER.finest("Really not important");
        
     // set the LogLevel to Info, severe, warning and info will be written
        // finest is still not written
//        LOGGER.setLevel(Level.INFO);
//        LOGGER.severe("Info Log");
//        LOGGER.warning("Info Log");
//        LOGGER.info("Info Log");
//        LOGGER.finest("Really not important");
        
        
     // set the LogLevel to Severe, only severe Messages will be written
        
//        LOGGER2.severe("Info Log");
//        LOGGER2.warning("Info Log");
//        LOGGER2.info("Info Log");
//        LOGGER2.finest("Really not important");
	    
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods on the bean: change the coach to Baseball in configuration file + no change in this code
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
