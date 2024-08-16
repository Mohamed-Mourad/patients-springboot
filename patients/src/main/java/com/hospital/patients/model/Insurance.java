package com.hospital.patients.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Insurance {
    private String id;
    private String patientName;
    private int insuranceNumber;

}
