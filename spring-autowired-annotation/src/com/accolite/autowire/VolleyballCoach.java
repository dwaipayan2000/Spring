package com.accolite.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

	private FortuneService fortuneService;
	
	public VolleyballCoach(){
		
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "You're inside Volleyball Coach";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
