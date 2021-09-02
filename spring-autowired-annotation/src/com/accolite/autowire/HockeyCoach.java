package com.accolite.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Autowired
	private FortuneService fortune;
	
	@Override
	public String getDailyWorkout() {
		return "HockeyCoach : getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
