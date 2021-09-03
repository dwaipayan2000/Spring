package com.accolite.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoxingJavaDemoApp {

	public static void main(String[] args) {
		//reading our config java class 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertiesBeanSportConfig.class);
		
		// retrieve bean from spring container
		BoxingCoach theCoach = context.getBean("boxer", BoxingCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("EMAIL ID : "+theCoach.getEmail());
		System.out.println("TEAM NAME : "+theCoach.getTeam());
		context.close();	
	}

}
