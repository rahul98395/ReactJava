package com.example.demo.dao;

import com.example.demo.entity.HealthcareProviders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HealthcareDao extends JpaRepository<HealthcareProviders,Long> {

    @Query(value = "SELECT * FROM doctor WHERE doctor.name LIKE CONCAT('%',:query, '%')",nativeQuery = true )
    List<HealthcareProviders> healthcareProvidersBySearch(String query);
}
