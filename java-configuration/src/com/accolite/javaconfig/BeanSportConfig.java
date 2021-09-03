package com.accolite.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanSportConfig {
	@Bean
	public FortuneService fs() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimmer() {
		return new SwimCoach(fs());
	}
	//fs and swimmer are the corresponding bean ids, it can be set to anything, for future reference...
}
