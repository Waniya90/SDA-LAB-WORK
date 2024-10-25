package employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Main {

    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 50000);

        // Printing employee details
        emp.printDetails();

        // Calculating and printing the tax
        double tax = emp.calculateTax();
        System.out.println("Tax to be paid: " + tax);
    }
}

    

