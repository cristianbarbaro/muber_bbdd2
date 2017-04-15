package models;

import java.util.ArrayList;
import java.util.List;

public class Passenger extends User {
	private Long idPassenger;
	private float totalCredit;
	private List<Travel> travels;
	
	public Passenger(String username, String password, float totalCredit) {
		super(username, password);
		this.totalCredit = totalCredit;
		this.travels = new ArrayList<Travel>();
	}

	public boolean addTravel(Travel travel) {
		if (travel.addPassenger(this)) {
			this.travels.add(travel);
			return true;
		}
		return false;
	}

	public Qualification qualify(Travel travel, int points, String comment) {
		return new Qualification(points, comment, this, travel);
	}

	public void charge(float cost) {
		this.totalCredit -= cost;
	}

	public Long getIdPassenger() {
		return idPassenger;
	}

	private void setIdPassenger(Long idPassenger) {
		this.idPassenger = idPassenger;
	}

	public List<Travel> getTravels() {
		return travels;
	}

	public void setTravels(List<Travel> travels) {
		this.travels = travels;
	}

	public float getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(float totalCredit) {
		this.totalCredit = totalCredit;
	}
}
