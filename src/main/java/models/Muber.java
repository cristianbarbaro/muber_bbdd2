package models;

import java.util.ArrayList;

public class Muber {
	private ArrayList<Passenger> passengers;
	private ArrayList<Driver> drivers;
	private ArrayList<Travel> travels;

	public ArrayList<Travel> getTravels() {
		return travels;
	}
	public void setTravels(ArrayList<Travel> travels) {
		this.travels = travels;
	}
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	public ArrayList<Driver> getDrivers() {
		return drivers;
	}
	public void setDrivers(ArrayList<Driver> drivers) {
		this.drivers = drivers;
	}
	
}
