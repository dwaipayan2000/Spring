package com.sprbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle)context.getBean("vehicle");
        obj.drive();
        System.out.println( "Hello World!" );
    }
}