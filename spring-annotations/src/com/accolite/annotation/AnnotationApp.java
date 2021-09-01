package com.accolite.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();	
	}

}
