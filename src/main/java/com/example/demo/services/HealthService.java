package com.example.demo.services;

import com.example.demo.entity.HealthcareProviders;

import java.util.List;

public interface HealthService {

    public List<HealthcareProviders> getHealthcareProviders();
    public List<HealthcareProviders> getHealthcareProvidersBySearch(String query);
}
