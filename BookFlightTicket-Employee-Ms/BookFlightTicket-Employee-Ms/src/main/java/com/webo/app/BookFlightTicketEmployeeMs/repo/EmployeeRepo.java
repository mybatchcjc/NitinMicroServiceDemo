package com.webo.app.BookFlightTicketEmployeeMs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.BookFlightTicketEmployeeMs.model.EmployeeFlight;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeFlight, String> {

	
	public List<EmployeeFlight> findAllByflightSourceAndFlightDestination(String flightSource,String flightDestination);
}
