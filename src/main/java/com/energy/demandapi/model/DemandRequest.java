package com.energy.demandapi.model;

public class DemandRequest {

	private String location;
    private double[] demand;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double[] getDemand() {
		return demand;
	}
	public void setDemand(double[] demand) {
		this.demand = demand;
	}

}
