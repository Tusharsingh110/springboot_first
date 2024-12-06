package com.example.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee1")
public class Employee {
    private int employeeId;

    @Value("Tushar")
    private String employeeFirstName;

    @Value("${java.home}")
    private String employeeLastName;

    @Value("#{4*4}")
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
