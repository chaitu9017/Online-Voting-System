package CodeForce;

import java.util.*;

public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int passengers = 0;
        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // passengers exiting
            int b = sc.nextInt(); // passengers entering

            passengers -= a; // First, passengers exit
            passengers += b; // Then, passengers enter

            capacity = Math.max(capacity, passengers);
        }

        System.out.println(capacity);
    }
}