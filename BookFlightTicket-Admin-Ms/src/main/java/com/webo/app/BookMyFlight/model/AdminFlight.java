package com.webo.app.BookMyFlight.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminFlight {

	@Id
	private String flightId;
	private String flightCompany;
	private String flightDepartureDate;
	private String flightDepartureTime;
	private String flightArrivalDate;
	private String flightArrivalTime;
	private String flightSource;
	private String flightDestination;
	private String flightDuration;
	private String flightFare;
	private String maxEconomyClassSeats;
	private String availableEconomyClassSeats;
	private String maxBusinessClassSeats;
	private String availableBusinessClassSeats;
	
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightCompany() {
		return flightCompany;
	}
	public void setFlightCompany(String flightCompany) {
		this.flightCompany = flightCompany;
	}
	public String getFlightDepartureDate() {
		return flightDepartureDate;
	}
	public void setFlightDepartureDate(String flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}
	public String getFlightDepartureTime() {
		return flightDepartureTime;
	}
	public void setFlightDepartureTime(String flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
	public String getFlightArrivalDate() {
		return flightArrivalDate;
	}
	public void setFlightArrivalDate(String flightArrivalDate) {
		this.flightArrivalDate = flightArrivalDate;
	}
	public String getFlightArrivalTime() {
		return flightArrivalTime;
	}
	public void setFlightArrivalTime(String flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	public String getFlightFare() {
		return flightFare;
	}
	public void setFlightFare(String flightFare) {
		this.flightFare = flightFare;
	}
	public String getMaxEconomyClassSeats() {
		return maxEconomyClassSeats;
	}
	public void setMaxEconomyClassSeats(String maxEconomyClassSeats) {
		this.maxEconomyClassSeats = maxEconomyClassSeats;
	}
	public String getAvailableEconomyClassSeats() {
		return availableEconomyClassSeats;
	}
	public void setAvailableEconomyClassSeats(String availableEconomyClassSeats) {
		this.availableEconomyClassSeats = availableEconomyClassSeats;
	}
	public String getMaxBusinessClassSeats() {
		return maxBusinessClassSeats;
	}
	public void setMaxBusinessClassSeats(String maxBusinessClassSeats) {
		this.maxBusinessClassSeats = maxBusinessClassSeats;
	}
	public String getAvailableBusinessClassSeats() {
		return availableBusinessClassSeats;
	}
	public void setAvailableBusinessClassSeats(String availableBusinessClassSeats) {
		this.availableBusinessClassSeats = availableBusinessClassSeats;
	}
	
}
