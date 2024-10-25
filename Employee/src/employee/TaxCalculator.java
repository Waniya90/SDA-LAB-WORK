package employee;


import employee.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
  // Separate class for tax calculation
public class TaxCalculator {
    // Separate class for tax calculation

    public double calculateTax(Employee employee) {
        return employee.getSalary() * 0.2;
    }
}
