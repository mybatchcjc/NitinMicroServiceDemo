package com.webo.app.BookMyFlight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AdminConfig {

	@Bean
	public RestTemplate getRt() {
		return new RestTemplate();
	}
}
