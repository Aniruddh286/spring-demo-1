package com.rudraksh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from spring container
		HockeyCoach hockeyCoach = context.getBean("myHockeyCoach", HockeyCoach.class);
		
		// call methods on bean
		System.out.println(hockeyCoach.getDailyWorkout());
		System.out.println(hockeyCoach.getDailyFortune());
		System.out.println(hockeyCoach.getEmailAddress());
		System.out.println(hockeyCoach.getTeam());
		
		// close the context
		context.close();

	}

}
