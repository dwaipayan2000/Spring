package com.accolite.javaconfig;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// define a default constructor
	public SwimCoach() {
		System.out.println(">> SwimCoach: inside default constructor");
	}
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice swimming daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
