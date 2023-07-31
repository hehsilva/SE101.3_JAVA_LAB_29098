package com.mycompany.employee;
public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Dhananji", 22, 50000, 10000);

        
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Bonus: " + employee.getBonus());

        
        double bonusAmount = employee.calculateBonusAmount();
        System.out.println("Bonus Amount: " + bonusAmount);
    }
}
