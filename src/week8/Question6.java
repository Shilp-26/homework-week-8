package week8;

import java.util.Scanner;

public class Question6 {


    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Enter number of rows : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }

    }
}
