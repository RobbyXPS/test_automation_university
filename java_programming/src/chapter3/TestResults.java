package chapter3;

import java.util.Scanner;

/*
    * calculate the letter grade of a student based on their test score.
    * F<60,D<70,C<80,B<90,A>=90
 */

public class TestResults {
    public static void main(String args[]){
        // Get the students test score as input
        System.out.println("Please enter the students test score");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();
        char grade;

        // Calculate the letter grade based on the test score
        if(testScore < 60){
            grade = 'F';
        }
        else if(testScore < 70){
            grade ='D';
        }
        else if(testScore < 80){
            grade = 'C';
        }
        else if(testScore < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("The students grade is a(n) " + grade);
    }
}
