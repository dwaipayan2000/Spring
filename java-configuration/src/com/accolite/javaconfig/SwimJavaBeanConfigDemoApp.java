package com.accolite.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaBeanConfigDemoApp {

	public static void main(String[] args) {
		//reading our config java class 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanSportConfig.class);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("swimmer", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();	
	}

}
