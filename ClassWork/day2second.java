package ClassWork;
// Given a number n, find all pairs of positive integers whose sum is n. For each pair, calculate their product. Print the highest product.

import java.util.Scanner;

public class day2second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int maxProduct = 0;

        for (int i = 1; i <= n / 2; i++) {
            int j = n - i;
            int product = i * j;

            System.out.println(i + " + " + j + " = " + n +
                               " -> Product = " + product);

            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println("Highest Product = " + maxProduct);

        sc.close();
    }
}