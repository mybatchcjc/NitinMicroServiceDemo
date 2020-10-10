package com.webo.app.BookMyFlight.BookFlightTicketSearchFlightMs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SearchFlightConfig {

	@Bean
	public RestTemplate getRt() {
		return new RestTemplate();
	}
}
