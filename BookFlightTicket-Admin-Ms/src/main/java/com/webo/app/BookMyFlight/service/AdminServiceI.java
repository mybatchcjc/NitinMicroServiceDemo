package com.webo.app.BookMyFlight.service;

import java.util.List;

import com.webo.app.BookMyFlight.model.AdminFlight;


public interface AdminServiceI {
	public void saveFlight(AdminFlight adminFlight);
	public void saveFlights(List<AdminFlight> adminFlights);
	public List<AdminFlight> getFlights();
	public List<AdminFlight> getFlights(String flightSource,String flightDestination);
	public void updateFlight(AdminFlight adminFlight);
}
