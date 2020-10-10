package com.webo.app.BookMyFlight.BookFlightTicketEurekaMs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class BookFlightTicketEurekaMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookFlightTicketEurekaMsApplication.class, args);
	}

}
