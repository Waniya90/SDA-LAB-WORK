/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Hp
 */
// Separate class for printing employee details
public class EmployeePrinter {
 

    public void print(Employee employee) {
        System.out.println(employee.getName() + "Employee Name: ");
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}


