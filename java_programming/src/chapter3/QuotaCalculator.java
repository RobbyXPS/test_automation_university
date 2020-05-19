package chapter3;

/*
  * Using an If/Else statement
  * All salespeople are expected to make at least 10 sales each week.
  * For those who do, they receive a congratulatory message.
  * For those who don't, they are informed of how many sales they were short.
*/

import java.util.Scanner;

public class QuotaCalculator {

    public void main(String args[]){
        // Instantiate known variables
        int quota = 10;

        // Obtain unknown values from user (their sales)
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Calculate output message based on input
        int salesShort = quota - sales;
        if (sales >= quota){
            System.out.println("Congratulations, you hit your quota!");
        }
        else {
            System.out.println("You did great but unfortunately you missed the quota by " + salesShort + " sales.");
        }
    }

}
