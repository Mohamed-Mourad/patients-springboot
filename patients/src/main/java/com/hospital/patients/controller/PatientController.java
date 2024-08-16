package com.hospital.patients.controller;

import com.hospital.patients.model.Patient;
import com.hospital.patients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService; // bean

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/print-name")
    public ResponseEntity printPatientName(@RequestParam String name, @RequestParam("a") Integer age){
        return ResponseEntity.ok(patientService.printName(name, age));
    }

    @GetMapping("/get-patients")
    public ResponseEntity getPatients(){
        return ResponseEntity.ok(patientService.getPatients());
    }

    @PostMapping("/add-patient")
    public ResponseEntity addPatient(@RequestBody Patient patient){
        return ResponseEntity.ok(patient);
    }
}
