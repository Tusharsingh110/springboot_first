package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("manager")
public class Manager {
    // we can just provide the autowired annotation before the Object instantiation to dynamically inject the bean.
    @Autowired
    @Qualifier("employee")
    public Employee employee;


    // Constructor Injection of the Employee Bean into the Manager Class.
//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
