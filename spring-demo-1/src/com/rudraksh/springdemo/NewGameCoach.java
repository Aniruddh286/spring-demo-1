package com.rudraksh.springdemo;

public class NewGameCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public NewGameCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "This is your workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
