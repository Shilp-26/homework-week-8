/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.
Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
to the original number. For example: 121, 12321, and 1001 etc.
Tip: Logic to check a palindrome number
Find the reverse of the given number. Store it in some variable, say reverse. Compare the number
with the reverse.
If both are the same then the number is a palindrome otherwise it is not.

 */

package week8;

public class Palindrome {

    public static void main(String[] args) {
isPalindrome(707);
    }

    public static boolean isPalindrome(int number) {
        int reversedNum = 0;
        int lastDigit = 0;

        Integer num = Integer.valueOf(number);

        while (number != 0) {
            lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            number = number / 10;
        }
        if (reversedNum == num) {
            System.out.println("It's a palindrome");
        } else
            System.out.println("Not a palindrome");
        return false;
    }
}
