package com.mycompany.employee;
public class TestEmployee {
    public static void main(String[] args) {
        
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        
        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Bogdan");
        mrBogdan.setEmpDesignation("Manager");

        
        msBird.setEmpID(102);
        msBird.setEmpName("Bird");
        msBird.setEmpDesignation("Developer");

        
        System.out.println("Mr. Bogdan Details:");
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println("\nMs. Bird Details:");
        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}
