package com.webo.app.BookMyFlight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.BookMyFlight.model.AdminFlight;
import com.webo.app.BookMyFlight.repository.AdminRepo;

@Service
public class AdminServiceImpl implements AdminServiceI{

	@Autowired
	private AdminRepo ar;
	@Override
	public void saveFlight(AdminFlight adminFlight) {
		// TODO Auto-generated method stub
		ar.save(adminFlight);
	}

	@Override
	public void saveFlights(List<AdminFlight> adminFlights) {
		// TODO Auto-generated method stub
		ar.saveAll(adminFlights);
	}

	@Override
	public List<AdminFlight> getFlights() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public List<AdminFlight> getFlights(String flightSource, String flightDestination) {
		// TODO Auto-generated method stub
		return ar.findAllByflightSourceAndFlightDestination(flightSource, flightDestination);
	}

	@Override
	public void updateFlight(AdminFlight adminFlight) {
		// TODO Auto-generated method stub
		ar.save(adminFlight);
	}

}
