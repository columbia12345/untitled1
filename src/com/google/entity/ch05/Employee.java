package com.google.entity.ch05;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;


    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;


    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
}

