package com.webo.app.BookMyFlight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.BookMyFlight.model.AdminFlight;

@Repository
public interface AdminRepo extends JpaRepository<AdminFlight, String>{

	public List<AdminFlight> findAllByflightSourceAndFlightDestination(String flightSource,String flightDestination);
}
