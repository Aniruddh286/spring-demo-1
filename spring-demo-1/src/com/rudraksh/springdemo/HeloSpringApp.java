package com.rudraksh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HeloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("baseballCoach", Coach.class); // here "myCoach" is the bean id mentioned in the xml file and Coach.class is the interface file
		Coach theCoach1 = context.getBean("myCoach",Coach.class);
		Coach theCoach2 = context.getBean("cricketCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		
		//calling new method for fortuneService
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach1.getDailyFortune());
		System.out.println(theCoach2.getDailyFortune());
		
		//close the context
		context.close();

	}

}
