package models;

import java.util.ArrayList;
import java.util.Date;

public class Driver extends User {
	private Date licence_expiration;
	private ArrayList<Travel> travels;
	private ArrayList<Qualification> qualifications;

	public Date getLicence_expiration() {
		return licence_expiration;
	}

	public void setLicence_expiration(Date licence_expiration) {
		this.licence_expiration = licence_expiration;
	}

	public ArrayList<Travel> getTravels() {
		return travels;
	}

	public void setTravels(ArrayList<Travel> travels) {
		this.travels = travels;
	}
	
	public ArrayList<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(ArrayList<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
}
