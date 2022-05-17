package com.rudraksh.springdemo;

public class HockeyCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//Create a no-arg constructor
	public HockeyCoach() {
		System.out.println("HockeyCoach: inside no-arg constructr");
	}
	
	
		
	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice running 60 minutes";
	}
	
	//Create setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("HockeyCoach: inside the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
