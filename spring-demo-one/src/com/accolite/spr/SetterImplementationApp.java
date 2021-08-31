package com.accolite.spr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterImplementationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("propertiesFileInjection.xml");
		
		// retrieve bean from spring container
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCricketCoach.getDailyWorkout());
		
		System.out.println(theCricketCoach.getDailyFortune());
		
		System.out.println(theCricketCoach.getEmailAddress());
		System.out.println(theCricketCoach.getTeam());
		
		// close the context
		context.close();
	}

}
