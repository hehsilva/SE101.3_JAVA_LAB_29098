package com.mycompany.employee;
public class Employee {
    private String name;
    private int age;
    private double basicSalary;
    private double bonus;

    
    public Employee(String name, int age, double basicSalary, double bonus) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    
    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
}
