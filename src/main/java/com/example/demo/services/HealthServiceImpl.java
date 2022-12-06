package com.example.demo.services;

import com.example.demo.dao.HealthcareDao;
import com.example.demo.entity.HealthcareProviders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthServiceImpl implements HealthService {

    @Autowired
    private HealthcareDao healthcareDao;

    @Override
    public List<HealthcareProviders> getHealthcareProviders() {
        return healthcareDao.findAll();
    }

    @Override
    public List<HealthcareProviders> getHealthcareProvidersBySearch(String query) {
        List<HealthcareProviders> healthcareProviders=  healthcareDao.healthcareProvidersBySearch(query);
        return healthcareProviders;
    }
}
