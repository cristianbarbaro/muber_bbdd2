package models;

import java.util.ArrayList;

public class Passenger extends User {
	private float total_credit;
	private ArrayList<Travel> travels;

	public float getTotal_credit() {
		return total_credit;
	}

	public void setTotal_credit(float total_credit) {
		this.total_credit = total_credit;
	}
}
