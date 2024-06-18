package com.example.Patient.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String Patient_name;
    private String Gender;
    private String Contact_info;
    public Patient() {
    }
    public Patient(Long id, String patient_name, String gender, String contact_info) {
        this.id = id;
        Patient_name = patient_name;
        Gender = gender;
        Contact_info = contact_info;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPatient_name() {
        return Patient_name;
    }
    public void setPatient_name(String patient_name) {
        Patient_name = patient_name;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public String getContact_info() {
        return Contact_info;
    }
    public void setContact_info(String contact_info) {
        Contact_info = contact_info;
    }
    
}
