package com.webo.app.BookMyFlight.BookFlightTicketSearchFlightMs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webo.app.BookMyFlight.BookFlightTicketSearchFlightMs.model.SearchFlight;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/search")
public class SearchFlightController {

	@Autowired
	RestTemplate rt;
	@RequestMapping(value = "/flights",method = RequestMethod.GET)
	public List<SearchFlight> getFlights(){
		List l=rt.getForObject("http://localhost:8112/employee/flights", List.class);
		ObjectMapper objectMapper=new ObjectMapper();
		List<SearchFlight> searchFlights=objectMapper.convertValue(l, new TypeReference<List<SearchFlight>>() {
		});
		return  searchFlights;
	}
	
	@RequestMapping(value = "/flights/{flightSource}/{flightDestination}",method = RequestMethod.GET)
	public List<SearchFlight> getFlights(@PathVariable("flightSource") String flightSource ,@PathVariable("flightDestination") String flightDestination){
		List l=rt.getForObject("http://localhost:8112/employee/flights/"+flightSource+"/"+flightDestination, List.class);
		ObjectMapper objectMapper=new ObjectMapper();
		List<SearchFlight> searchFlights=objectMapper.convertValue(l,new TypeReference<List<SearchFlight>>() {
		});
		return searchFlights;
	}
}
