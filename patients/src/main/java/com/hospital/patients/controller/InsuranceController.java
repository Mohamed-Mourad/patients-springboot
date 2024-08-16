package com.hospital.patients.controller;

import com.hospital.patients.model.Insurance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/ins")
public class InsuranceController {

    @GetMapping("/patient-insurance")
    public Insurance getPatientInsurance(){
        return Insurance.builder()
                .id(UUID.randomUUID().toString())
                .insuranceNumber(12300)
                .patientName("Mohamed Mourad")
                .build();
    }
}
