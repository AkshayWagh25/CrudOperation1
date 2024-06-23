package com.example.CrudOperation.entity;

import jakarta.persistence.*;


@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNumber;
    @Column
    private String name ;
    @Column
    private double percentage;
    @Column
    private char division;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public Students(int rollNumber, String name, double percentage, char division) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
        this.division = division;
    }

    public Students() {
    }
}
