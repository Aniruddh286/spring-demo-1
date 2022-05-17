package com.rudraksh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if the are same beans
		boolean result = (theCoach == alphaCoach);
		
		//print the results
		System.out.println("Ponting to the same objects: "+ result);
		System.out.println("\nMemory loacation for theCoach: "+ theCoach);
		System.out.println("\nMemorey location for alphaCoach: "+ alphaCoach);
		// close the context
		context.close();
		

	}

}
