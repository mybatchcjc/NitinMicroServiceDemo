package com.webo.app.BookFlightTicketEmployeeMs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.BookFlightTicketEmployeeMs.model.EmployeeFlight;
import com.webo.app.BookFlightTicketEmployeeMs.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

	@Autowired
	EmployeeRepo er;
	@Override
	public void saveFlight(EmployeeFlight employeeFlight) {
		// TODO Auto-generated method stub
		er.save(employeeFlight);
	}

	@Override
	public void saveFlights(List<EmployeeFlight> employeeFlights) {
		// TODO Auto-generated method stub
		er.saveAll(employeeFlights);
	}

	@Override
	public List<EmployeeFlight> getFlights() {
		// TODO Auto-generated method stub
return 	er.findAll();
	}

	@Override
	public List<EmployeeFlight> getFlights(String flightSource, String flightDestination) {
		// TODO Auto-generated method stub
		return er.findAllByflightSourceAndFlightDestination(flightSource, flightDestination);
	}

	@Override
	public void updateFlight(EmployeeFlight employeeFlight) {
		// TODO Auto-generated method stub
		er.save(employeeFlight);
	}

}
