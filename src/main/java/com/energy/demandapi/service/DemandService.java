package com.energy.demandapi.service;

import org.springframework.stereotype.Service;

import com.energy.demandapi.model.DemandRequest;
import com.energy.demandapi.model.DemandResponse;

@Service
public class DemandService {

	public DemandResponse analyzeDemand(DemandRequest request) {

		// ✅ SAFETY CHECK
	    if (request == null || request.getDemand() == null || request.getDemand().length == 0) {
	        throw new IllegalArgumentException("Demand data is missing");
	    }

	    double[] demand = request.getDemand();
	    String location = request.getLocation();

	    double max = Double.MIN_VALUE;
	    double min = Double.MAX_VALUE;
	    double sum = 0;

	    for (double d : demand) {
	        max = Math.max(max, d);
	        min = Math.min(min, d);
	        sum += d;
	    }

	    double average = sum / demand.length;

	    String trend;
	    if (demand[demand.length - 1] > demand[0]) {
	        trend = "Increasing Demand Trend";
	    } else if (demand[demand.length - 1] < demand[0]) {
	        trend = "Decreasing Demand Trend";
	    } else {
	        trend = "Stable Demand Trend";
	    }

	    boolean spikeDetected = false;
	    for (double d : demand) {
	        if (d > average * 1.2) {
	            spikeDetected = true;
	            break;
	        }
	    }

	    double predictedNextDemand = demand[demand.length - 1];
	    if (location.equalsIgnoreCase("Outskirts")) {
	        predictedNextDemand *= 1.10;
	    }

	    DemandResponse response = new DemandResponse();
	    response.setMaxDemand(max);
	    response.setMinDemand(min);
	    response.setAverageDemand(average);
	    response.setTrend(trend);
	    response.setSpikeDetected(spikeDetected);
	    response.setPredictedNextDemand(predictedNextDemand);

	    return response;
    }
}
