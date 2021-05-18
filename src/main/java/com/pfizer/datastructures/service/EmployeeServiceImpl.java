package com.pfizer.datastructures.service;

import com.pfizer.datastructures.exception.NotSuchElementException;
import com.pfizer.datastructures.model.Employee;
import com.pfizer.datastructures.repository.EmployeeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //functional programming
    // lambda calculus

    @Override
    public List<Employee> getEmployeePositiveBalance() {
        return employeeRepository
                .readEmployee()
                .stream()
                .filter(employee -> employee.getBalance() > 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> sortByName() {
        employeeRepository
                .readEmployee()
                .sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        return employeeRepository
                .readEmployee();

    }

    @Override
    public Employee getEmployeeMaximumBalance() throws NotSuchElementException {
        return employeeRepository
                .readEmployee()
                .stream()
                .max(Comparator.comparing(Employee::getBalance))
                .orElseThrow(NotSuchElementException::new)
                ;

    }

    @Override
    public double getSumOfBalances() {
        return employeeRepository
                .readEmployee()
                .stream()
//                .map(employee -> employee.getBalance())
//                .reduce(0., (b1,b2) ->(b1+b2))
//                ;
        .mapToDouble(Employee::getBalance)
        .sum();
    }

    @Override
    public List<String> getEmployeeNames() {
        return employeeRepository
                .readEmployee()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList())
                ;
    }
}
