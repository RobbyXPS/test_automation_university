package chapter3;

/*
The objective of the game is to enter enough change to equal exactly $1! Create a program that asks a user to
enter the quantities for the following coins: pennies, nickels, dimes, quarters. Your program should count up
the value of all the change. If it's exactly $1, they win! if it's more than $1, tell them by how much they went over.
If it's less than $1, tell them by how much they went under.
 */

import java.util.Scanner;

public class coinCounterGame {
    public static void main(String args[]){

        // instantiate known variables
        int dollar = 100;

        // gather input from player
        // get amount of pennies from player
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies do you have?");
        int pennies = scanner.nextInt();
        int penniesAmount = pennies * 1;

        // get amount of nickels from player
        System.out.println("How many nickels do you have?");
        int nickels = scanner.nextInt();
        int nickelsAmount = nickels * 5;

        // get amount of dimes from player
        System.out.println("How many dimes do you have?");
        int dimes = scanner.nextInt();
        int dimesAmount = dimes * 10;

        // get amount of quarters from player
        System.out.println("How many quarters do you have?");
        int quarters = scanner.nextInt();
        int quartersAmount = quarters * 25;
        scanner.close();

        // calculate the amount of change to a dollar
        double total = penniesAmount + nickelsAmount + dimesAmount + quartersAmount;
        if (total > dollar) {
            double differenceOver = (total - dollar) * .01;
            System.out.println("Sorry, you did not win this time. You were over by $" + differenceOver + ".");
        } else if (total < dollar) {
            double differenceUnder = (dollar - total) * .01;
            System.out.println("Sorry, you did not win this time. You were under by $" + differenceUnder + ".");
        } else {
            System.out.println("Congratulations you won!");
        }
    }
}
