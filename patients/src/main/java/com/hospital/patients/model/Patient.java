package com.hospital.patients.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient {

    @JsonProperty("firstName")
    private String name;

    @JsonProperty("Age")
    private Integer age;

    public Patient(){}

    public Patient(String name){
        this.name = name;
    }

    public Patient(String name, Integer age){
        this.name = name;
        this.age  = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


