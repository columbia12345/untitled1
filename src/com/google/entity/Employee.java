package com.google.entity;

public class Employee {

    private String name;
    private double salary;
    int num;


    public Employee() {
        this("tom", 1);
        System.out.println("无参数的构造器");
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("有参数的构造器");

    }
public static void main(String[] args){

}

}

