package chapter3;

/*
    * Print out a thoughtful message based on the students letter grade
    * A = Excellent Job
    * B = Great Job
    * C = Good Job
    * D = You need to work a bit harder
    * F = Uh, oh!
 */

import java.util.Scanner;

public class gradeMessage {
    public static void main(String args[]){
        // Obtain the letter grade via input
        System.out.println("What is the students letter grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        // Calculate the message based on the letter grade
        String message;
        switch(grade){
            case "A":
                message = "Excellent Job.";
                break;
            case "B":
                message = "Great Job.";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh, Oh!";
                break;
            default:
                message = "Please supply a valid grade ... A,B,C,D, or F.";
        }
        System.out.println(message);
    }
}
