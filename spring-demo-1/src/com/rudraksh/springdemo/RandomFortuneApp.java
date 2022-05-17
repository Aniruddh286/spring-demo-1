package com.rudraksh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("newGame",Coach.class);
		
		//call the methods
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());

	}

}
