package com.pfizer.datastructures.repository;

import com.pfizer.datastructures.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    Employee createEmployee(Employee employee);
    Employee readEmployee(int index);
    Optional<Employee> getEmployee(int index);

    List<Employee> readEmployee();
    Employee updateEmployee(int index, Employee employee);
    boolean deleteEmployee(int index);
}
