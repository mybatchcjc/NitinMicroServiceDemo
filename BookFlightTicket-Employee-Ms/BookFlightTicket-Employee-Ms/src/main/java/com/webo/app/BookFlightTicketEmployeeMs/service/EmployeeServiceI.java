package com.webo.app.BookFlightTicketEmployeeMs.service;

import java.util.List;

import com.webo.app.BookFlightTicketEmployeeMs.model.EmployeeFlight;

public interface EmployeeServiceI  {

	public void saveFlight(EmployeeFlight employeeFlight);
	public void saveFlights(List<EmployeeFlight> employeeFlights);
	public List<EmployeeFlight> getFlights();
	public List<EmployeeFlight> getFlights(String flightSource,String flightDestination);
	public void updateFlight(EmployeeFlight employeeFlight);
}
