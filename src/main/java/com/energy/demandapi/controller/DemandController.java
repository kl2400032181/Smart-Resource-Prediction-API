package com.energy.demandapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.energy.demandapi.model.DemandRequest;
import com.energy.demandapi.model.DemandResponse;
import com.energy.demandapi.service.DemandService;

@RestController
public class DemandController {

    private final DemandService demandService;

    public DemandController(DemandService demandService) {
        this.demandService = demandService;
    }

    @PostMapping("/predict-demand")
    public DemandResponse predictDemand(@RequestBody DemandRequest request) {
        return demandService.analyzeDemand(request);
    }
}
