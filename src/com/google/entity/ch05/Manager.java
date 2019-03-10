package com.google.entity.ch05;

public class Manager extends Employee {

    private double bonus;
    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }


    @Override //覆盖，重写:只能发生在父子类中，即继承中
    //子类里的方法与父类的方法名，参数，返回值都相同
    //访问权限相同或更宽松，就称为重写或者覆盖
    //为什么要重写？对父类中的方法或者内容不满意
    public double getSalary() {
        return getSalary() + bonus;
    }

}
