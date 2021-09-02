package com.accolite.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "You're inside Tennis Coach";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
