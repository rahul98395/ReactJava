package com.example.demo.controller;

import com.example.demo.entity.HealthcareProviders;
import com.example.demo.services.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class HealthcareController {

    @Autowired
    private HealthService healthService;

    @GetMapping("/healthcareProviders")
    public List<HealthcareProviders> getHealthcareProviders()
    {
        return this.healthService.getHealthcareProviders();
    }

    @GetMapping("/healthcareProvidersBySearch")
    public List<HealthcareProviders> getHealthcareProvidersBySearch(@RequestParam("query") String query)
    {
        return this.healthService.getHealthcareProvidersBySearch(query);
    }

}
