package com.pfizer.datastructures.repository;

import com.pfizer.datastructures.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepositoryImpl(){
        employees = new ArrayList<>();
    }


    public Employee createEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }


    public Employee readEmployee(int index){
        Employee employee = employees.get(index);
        return employee;
    }
    public List<Employee> readEmployee(){
        return employees;
    }
    public  Employee  updateEmployee(int index,Employee employee ){
        Employee employeeInList = employees.get(index);
        employeeInList.setName(employee.getName());
        employeeInList.setBalance(employee.getBalance());
        return employeeInList;

    }

    public boolean deleteEmployee(int index){
        Employee employeeInList = employees.get(index);
        if (employeeInList==null) return false;
        employees.remove(index);
        return true;
    }


}
