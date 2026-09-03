package CodeForce;

import java.util.*;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        int[] count = new int[26];

        // Count letters from guest and host names
        for (char ch : guest.toCharArray()) {
            count[ch - 'A']++;
        }

        for (char ch : host.toCharArray()) {
            count[ch - 'A']++;
        }

        // Remove letters from the pile
        for (char ch : pile.toCharArray()) {
            count[ch - 'A']--;
        }

        // Every letter count must be exactly zero
        for (int x : count) {
            if (x != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}