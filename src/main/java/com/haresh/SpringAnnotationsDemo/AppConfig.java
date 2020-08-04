package com.haresh.SpringAnnotationsDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Processor getSnapdragon() {
		return new Snapdragon("Qualcomm");
	}
	
	@Bean
	public Mobile getSamsungMobile() {
		return new Samsung();
	}
}
