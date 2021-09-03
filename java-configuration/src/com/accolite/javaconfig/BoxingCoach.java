package com.accolite.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class BoxingCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	// define a default constructor
	public BoxingCoach() {
		System.out.println(">> SwimCoach: inside default constructor");
	}
	public BoxingCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Punch the wall";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
	

}
