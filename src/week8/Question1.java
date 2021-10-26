/*
public class Program_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        //Condition to count upto 10 numbers
        while (count <= 10) {
            System.out.print("Enter number #" + count + ": ");

            boolean validateNumber = scanner.hasNextInt();  // hasNextInt() method from the scanner to check if the user has entered an int value
            if (validateNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();     // Always return new user input
        }
        System.out.println("Sum of all numbers: " + sum);
        scanner.close();
    }
}

 */

package week8;

import java.util.Scanner;

public class Question1 {


    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");

        while (i <= 10) {

            System.out.println("Enter the number");
            sum += sc.nextInt();
            if (sc.hasNextInt()) {
                i++;
            }
           // System.out.println("The total sum is: " + sum);
        }
        System.out.println("The total sum is: " + sum);
        System.out.println("Invalid Number");
        sc.close();
    }
}


