package com.pfizer.datastructures.service;

import com.pfizer.datastructures.exception.NotSuchElementException;
import com.pfizer.datastructures.model.Employee;

import java.util.List;

public interface EmployeeService {

    //filter example
    List<Employee> getEmployeePositiveBalance();

    //sort example
    List<Employee> sortByName();

    //aggregation
    Employee getEmployeeMaximumBalance() throws NotSuchElementException;
    double getSumOfBalances();

    //transformation
    List<String> getEmployeeNames();

}
