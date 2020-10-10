package com.webo.app.BookFlightTicketEmployeeMs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfig {

	@Bean
	public RestTemplate getRt() {
		return new RestTemplate();
	}
	
}
