package com.example.BookFlightTicketCloudMs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class BookFlightTicketCloudMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookFlightTicketCloudMsApplication.class, args);
	}

}
