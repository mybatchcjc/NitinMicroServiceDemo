package com.webo.app.BookMyFlight.Controller;

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
import com.webo.app.BookMyFlight.model.AdminFlight;
import com.webo.app.BookMyFlight.service.AdminServiceI;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	RestTemplate rt;
	@Autowired
	AdminServiceI asi;

	@RequestMapping(value = "/flights", method = RequestMethod.POST)
	public ResponseEntity<String> saveFlights(@RequestBody List<AdminFlight> adminFlights) {
		asi.saveFlights(adminFlights);
		return new ResponseEntity<String>("flights saved successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/flight", method = RequestMethod.POST)
	public ResponseEntity<String> saveFlight(@RequestBody AdminFlight adminFlight) {
		asi.saveFlight(adminFlight);
		return new ResponseEntity<String>("flight save successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public List<AdminFlight> getFlights() {
		
		  List l = rt.getForObject("http://localhost:8112/employee/flights",
		  List.class); ObjectMapper objectMapper = new ObjectMapper();
		  List<AdminFlight> adminFlights = objectMapper.convertValue(l, new
		  TypeReference<List<AdminFlight>>() { }); asi.saveFlights(adminFlights);
		 
		/*
		 * for single save for (EmployeeFlight employeeFlight : employeeFlights) {
		 * esi.saveFlight(employeeFlight); }
		 */
		return asi.getFlights();
	}

	@RequestMapping(value = "/flights/{flightSource}/{flightDestination}", method = RequestMethod.GET)
	public List<AdminFlight> getFlights(@PathVariable("flightSource") String flightSource,
			@PathVariable("flightDestination") String flightDestination) {
		return asi.getFlights(flightSource, flightDestination);
	}

	@RequestMapping(value = "/flight", method = RequestMethod.PUT)
	public ResponseEntity<String> updateFlights(@RequestBody AdminFlight adminFlight) {
		asi.updateFlight(adminFlight);
		return new ResponseEntity<String>("flight updated successfully", HttpStatus.OK);
	}
}
