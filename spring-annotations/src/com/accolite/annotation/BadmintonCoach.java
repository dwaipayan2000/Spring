package com.accolite.annotation;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Implementing Default Component";
	}

}
