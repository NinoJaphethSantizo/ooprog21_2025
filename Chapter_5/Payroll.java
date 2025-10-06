// Payroll.java
import java.util.Scanner;

public class Payroll {

    // Employee class (inner class)
    static class Employee {
        private int employeeNumber;
        private double payRate;
        private final int MAX_EMPLOYEE_NUMBER = 9999;
        private final double MAX_RATE = 60.00;
        private final double OVERTIME_MULTIPLIER = 1.5;

        // Constructor
        public Employee(int employeeNumber, double payRate) {
            // Limit employee number
            if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
                this.employeeNumber = MAX_EMPLOYEE_NUMBER;
            } else if (employeeNumber < 1) {
                this.employeeNumber = 1;
            } else {
                this.employeeNumber = employeeNumber;
            }

            // Limit pay rate
            if (payRate > MAX_RATE) {
                this.payRate = MAX_RATE;
            } else if (payRate < 0) {
                this.payRate = 0;
            } else {
                this.payRate = payRate;
            }
        }

        // Getters
        public int getEmployeeNumber() {
            return employeeNumber;
        }

        public double getPayRate() {
            return payRate;
        }

        // Calculate regular pay (up to 40 hours)
        public double getRegularPay(double hoursWorked) {
            if (hoursWorked > 40) {
                return 40 * payRate;
            } else {
                return hoursWorked * payRate;
            }
        }

        // Calculate overtime pay (beyond 40 hours)
        public double getOvertimePay(double hoursWorked) {
            if (hoursWorked > 40) {
                double overtimeHours = hoursWorked - 40;
                return overtimeHours * payRate * OVERTIME_MULTIPLIER;
            } else {
                return 0;
            }
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Number (1-9999): ");
        int empNum = input.nextInt();

        System.out.print("Enter Pay Rate (max 60.00): ");
        double rate = input.nextDouble();

        System.out.print("Enter Hours Worked this week: ");
        double hours = input.nextDouble();

        // Create employee object
        Employee emp = new Employee(empNum, rate);

        // Calculate pays
        double regularPay = emp.getRegularPay(hours);
        double overtimePay = emp.getOvertimePay(hours);
        double totalPay = regularPay + overtimePay;

        // Display results
        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee Number: " + emp.getEmployeeNumber());
        System.out.printf("Pay Rate: $%.2f%n", emp.getPayRate());
        System.out.printf("Regular Pay: $%.2f%n", regularPay);
        System.out.printf("Overtime Pay: $%.2f%n", overtimePay);
        System.out.printf("Total Pay: $%.2f%n", totalPay);

        input.close();
    }
}
