package com.example.Patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Patient.domain.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{
    
}
