package com.mycompany.employeemanagementsystem;
import java.sql.*;

public class EmployeeManagementSystem {

    private final Connection connection;
    private final Statement statement;

    public EmployeeManagementSystem() throws SQLException {
        // Connect to the database
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "";
        connection = DriverManager.getConnection(url, username, password);

        // Create a statement
        statement = connection.createStatement();
    }

    public void createTable() throws SQLException {
        // Create the table
        String sql = "CREATE TABLE employee (name VARCHAR(255), id INT, age INT, gender VARCHAR(10), department INT)";
        statement.executeUpdate(sql);
    }

    public void insertRecord(String name, int id, int age, String gender, int department) throws SQLException {
        // Insert the record
        String sql = "INSERT INTO employee (name, id, age, gender, department) VALUES ('" + name + "', " + id + ", " + age + ", '" + gender + "', " + department + ")";
        statement.executeUpdate(sql);
    }

    public void searchRecord(int id) throws SQLException {
        // Search the record
        String sql = "SELECT * FROM employee WHERE id = " + id;
        ResultSet resultSet = statement.executeQuery(sql);

        // Display the record
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String gender = resultSet.getString("gender");
            int department = resultSet.getInt("department");

            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Department: " + department);
        } else {
            System.out.println("Record not found");
        }
    }

    public void updateRecord(int id, String name, int age, String gender, int department) throws SQLException {
        // Update the record
        String sql = "UPDATE employee SET name = '" + name + "', age = " + age + ", gender = '" + gender + "', department = " + department + " WHERE id = " + id;
        statement.executeUpdate(sql);
    }

    public void deleteRecord(int id) throws SQLException {
        // Delete the record
        String sql = "DELETE FROM employee WHERE id = " + id;
        statement.executeUpdate(sql);
    }

    public static void main(String[] args) throws SQLException {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        // Create the table
        system.createTable();

        // Insert 5 records
        system.insertRecord("John Doe", 1, 30, "Male", 1);
        system.insertRecord("Jane Doe", 2, 25, "Female", 2);
        system.insertRecord("Bill Smith", 3, 40, "Male", 3);
        system.insertRecord("Mary Jones", 4, 20, "Female", 4);
        system.insertRecord("Peter Chang", 5, 35, "Male", 5);

        // Search for a record
        system.searchRecord(2);

        // Update a record
        system.updateRecord(3, "Jane Doe updated", 35, "Female", 3);

        // Delete a record
        system.deleteRecord(4);
    }
}

