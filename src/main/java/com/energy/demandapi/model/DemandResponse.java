package com.energy.demandapi.model;

public class DemandResponse {
	private double maxDemand;
    private double minDemand;
    private double averageDemand;
    private String trend;
    private boolean spikeDetected;
    private double predictedNextDemand;
	public double getMaxDemand() {
		return maxDemand;
	}
	public void setMaxDemand(double maxDemand) {
		this.maxDemand = maxDemand;
	}
	public double getMinDemand() {
		return minDemand;
	}
	public void setMinDemand(double minDemand) {
		this.minDemand = minDemand;
	}
	public double getAverageDemand() {
		return averageDemand;
	}
	public void setAverageDemand(double averageDemand) {
		this.averageDemand = averageDemand;
	}
	public String getTrend() {
		return trend;
	}
	public void setTrend(String trend) {
		this.trend = trend;
	}
	public boolean isSpikeDetected() {
		return spikeDetected;
	}
	public void setSpikeDetected(boolean spikeDetected) {
		this.spikeDetected = spikeDetected;
	}
	public double getPredictedNextDemand() {
		return predictedNextDemand;
	}
	public void setPredictedNextDemand(double predictedNextDemand) {
		this.predictedNextDemand = predictedNextDemand;
	}
    

}
