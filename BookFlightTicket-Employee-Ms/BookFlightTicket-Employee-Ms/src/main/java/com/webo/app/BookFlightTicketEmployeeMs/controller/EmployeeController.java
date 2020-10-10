package com.webo.app.BookFlightTicketEmployeeMs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webo.app.BookFlightTicketEmployeeMs.model.EmployeeFlight;
import com.webo.app.BookFlightTicketEmployeeMs.service.EmployeeServiceI;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	RestTemplate rt;
	
	@Autowired
	EmployeeServiceI esi;

	@RequestMapping(value = "/flights", method = RequestMethod.POST)
	public ResponseEntity<String> saveFlights(@RequestBody List<EmployeeFlight> employeeFlights) {
		esi.saveFlights(employeeFlights);
		return new ResponseEntity<String>("flights saved successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/flight", method = RequestMethod.POST)
	public ResponseEntity<String> saveFlight(@RequestBody EmployeeFlight employeeFlight) {
		esi.saveFlight(employeeFlight);
		return new ResponseEntity<String>("flight save successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public List<EmployeeFlight> getFlights() {
		System.out.println("employee flights called");
		List l = rt.getForObject("http://localhost:8111/admin/flights", List.class);
		ObjectMapper objectMapper = new ObjectMapper();
		List<EmployeeFlight> employeeFlights = objectMapper.convertValue(l, new TypeReference<List<EmployeeFlight>>() {
		});
		esi.saveFlights(employeeFlights);
		/*
		 * for single save for (EmployeeFlight employeeFlight : employeeFlights) {
		 * esi.saveFlight(employeeFlight); }
		 */
		return esi.getFlights();
	}

	@RequestMapping(value = "/flights/{flightSource}/{flightDestination}", method = RequestMethod.GET)
	public List<EmployeeFlight> getFlights(@PathVariable("flightSource") String flightSource,
			@PathVariable("flightDestination") String flightDestination) {
		return esi.getFlights(flightSource, flightDestination);
	}

	@RequestMapping(value = "/flight", method = RequestMethod.PUT)
	public ResponseEntity<String> updateFlights(@RequestBody EmployeeFlight employeeFlight) {
		esi.updateFlight(employeeFlight);
		return new ResponseEntity<String>("flight updated successfully", HttpStatus.OK);
	}
}
