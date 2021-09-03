package com.accolite.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class PropertiesBeanSportConfig {
	@Bean
	public FortuneService fs() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach boxer() {
		return new BoxingCoach(fs());
	}
	//fs and swimmer are the corresponding bean ids, it can be set to anything, for future reference...
}
