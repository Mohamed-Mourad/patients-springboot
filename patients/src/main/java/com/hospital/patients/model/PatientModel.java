package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientModel {

    List<Patient> patients = new ArrayList<>();

    PatientModel(){
        patients.add(new Patient("mohamed mourad", 24));
        patients.add(new Patient("khaled mourad", 25));
        patients.add(new Patient("amr mourad", 27));
    }
    public List<Patient> getPatients(){
        return patients;
    }
}
