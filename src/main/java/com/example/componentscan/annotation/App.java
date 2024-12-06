package com.example.componentscan.annotation;

import com.example.componentscan.annotation.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean("annotatedEmployee", Employee.class);
        System.out.println(employee.toString());
//        Employee.displayDetails();
    }
}
