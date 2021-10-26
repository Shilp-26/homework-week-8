/*
Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge
 */
package week8;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            if (!sc.hasNextInt())
                break;
            int num = sc.nextInt();

            min = Math.min(min, num);
            max = Math.max(max, num);

        }
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);


    }

}
