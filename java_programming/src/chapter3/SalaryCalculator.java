package chapter3;

import java.util.Scanner;

/*
If-statment exercise business logic.
All salespeople get a payment of #1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250
 */

public class SalaryCalculator {
    public static void main(String arg[]){
        // Instantiate known variables
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Obtain unknown variables from the user
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesThisWeek = scanner.nextInt();
        scanner.close();

        // Do calculations
        if (salesThisWeek > quota) {
            salary = salary + bonus;
        }

        // Display Output
        System.out.println("You made $" + salary + " this week, greate job!");
    }
}
