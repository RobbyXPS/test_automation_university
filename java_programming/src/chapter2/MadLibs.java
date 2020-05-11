package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        // 1. Get the season of the year
        System.out.println("Enter the season of the year for your madlib!");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Get the whole number for the madlib
        System.out.println("Enter the whole number for your madlib!");
        int wholeNumber = scanner.nextInt();

        // 3. Get the adjective phrase for the madlib
        System.out.println("Enter the adjective for your madLib");
        String phrase = scanner.next();

        // scanner is no longer needed after input steps
        scanner.close();

        // Print out the madblib
        System.out.println("On a" + " " + phrase + " " + season  + " " + "day, I drink a minimum of" + " " + wholeNumber + " " + "cups of coffee.");
    }
}
