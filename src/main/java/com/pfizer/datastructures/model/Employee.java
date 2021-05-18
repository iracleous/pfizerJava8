package com.pfizer.datastructures.model;

import lombok.Data;

import java.util.Date;


@Data
public class Employee {
    private String name;
    private double balance;
    private Date birthDate;
    private int id;

}
