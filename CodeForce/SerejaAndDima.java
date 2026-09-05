package CodeForce;

import java.util.*;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int sereja = 0;
        int dima = 0;

        for (int turn = 0; turn < n; turn++) {
            int card;

            // Choose the larger card from either end
            if (cards[left] > cards[right]) {
                card = cards[left];
                left++;
            } else {
                card = cards[right];
                right--;
            }

            if (turn % 2 == 0) {
                sereja += card;
            } else {
                dima += card;
            }
        }

        System.out.println(sereja + " " + dima);
    }
}