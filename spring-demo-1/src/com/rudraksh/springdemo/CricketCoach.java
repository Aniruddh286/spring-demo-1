package com.rudraksh.springdemo;

public class CricketCoach implements Coach{
	
	FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "10 rounds of the ground";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
