package com.accolite.spr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach newCoach = context.getBean("myCoach", Coach.class);
		
		//check if both are the same reference or not
		boolean res=(theCoach==newCoach);
		System.out.println(res);
		
		context.close();
	}

}
