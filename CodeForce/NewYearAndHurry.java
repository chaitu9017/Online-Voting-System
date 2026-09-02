package CodeForce;

import java.util.*;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int time = 240 - k;

        int solved = 0;
        int usedTime = 0;

        for (int i = 1; i <= n; i++) {
            usedTime += 5 * i;

            if (usedTime <= time) {
                solved++;
            } else {
                break;
            }
        }

        System.out.println(solved);
    }
}