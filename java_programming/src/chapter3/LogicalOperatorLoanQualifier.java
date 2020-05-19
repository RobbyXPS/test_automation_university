package chapter3;

/*
    * LOGICAL OPERATOR
    * To qualify for a loan, a person must make at least #30,000
    * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String arg[]) {
        // Initialize known variables
        int requiredSalary = 30000;
        int requiredEmploymentDuration = 2;

        // Get values from customer
        System.out.println("Please provide your yearly income:");
        Scanner scanner = new Scanner(System.in);
        float Salary = scanner.nextFloat();

        System.out.println("Please provide your employment duration:");
        int EmploymentDuration = scanner.nextInt();
        scanner.close();

        // Compare loan requirements to customers using nested ifs
        if(Salary >= requiredSalary && EmploymentDuration >= requiredEmploymentDuration) {
            System.out.println("Congratulations! You have been approved for your $30,000 loan.");
        }
        else {
            System.out.println("We are sorry, you do not meet the requirements for this loan.");
        }
    }
}
