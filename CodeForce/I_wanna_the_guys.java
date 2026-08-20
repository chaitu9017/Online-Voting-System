package CodeForce;

import java.util.Scanner;

public class I_wanna_the_guys {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] levels = new boolean[n + 1];

        // Levels Little X can pass
        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {
            int level = sc.nextInt();
            levels[level] = true;
        }

        // Levels Little Y can pass
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int level = sc.nextInt();
            levels[level] = true;
        }

        // Check all levels
        for (int i = 1; i <= n; i++) {
            if (!levels[i]) {
                System.out.println("Oh, my keyboard!");
                sc.close();
                return;
            }
        }

        System.out.println("I become the guy.");

        sc.close();
    }
}