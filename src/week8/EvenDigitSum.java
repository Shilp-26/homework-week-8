/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */

package week8;

public class EvenDigitSum {

    public static void main(String[] args) {
        getEvenDigitSum(252);
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number > 0) {
            while (number != 0) {
                int even = number % 10;
                if (even % 2 == 0) {
                    sum += even;
                }
                number /= 10;
            }
            System.out.println(sum);
        }
        return -1;
    }
}
