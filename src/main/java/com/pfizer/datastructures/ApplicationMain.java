package com.pfizer.datastructures;

import com.pfizer.datastructures.model.Employee;
import com.pfizer.datastructures.repository.EmployeeRepository;
import com.pfizer.datastructures.repository.EmployeeRepositoryImpl;
import com.pfizer.datastructures.service.EmployeeService;
import com.pfizer.datastructures.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class ApplicationMain {

    public static void main(String[] args) {



        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        EmployeeService employeeService = new EmployeeServiceImpl(employeeRepository);


        Employee employee = new Employee();
        employee.setId(4);
        employee.setName("Dimitris");
        employee.setBalance(10);
        employee.setBirthDate(new Date(2000,3,1));

        employeeRepository.createEmployee(employee);

        double totalBalance =  employeeService.getSumOfBalances();

        log.info("total Balance = "+ totalBalance);
    }
}
