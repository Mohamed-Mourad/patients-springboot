package com.hospital.patients.service;

import com.hospital.patients.model.Patient;
import com.hospital.patients.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PatientService {

    @Autowired
    private PatientModel patientModel;

    public Patient printName(String name, Integer age){
        Patient p = patientModel.getPatients()
                .stream()
                .filter(i -> Objects.equals(i.getName(), name) || Objects.equals(i.getAge(), age))
                .findAny()
                .orElse(new Patient("No Patient Found", null));
        return p;
    }

    public List<Patient> getPatients(){
        return this.patientModel.getPatients();
    }
}
