package CodeForce;

import java.util.Scanner;

public class Magnet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String previous = "";
        int groups = 0;

        for (int i = 0; i < n; i++) {
            String current = sc.next();

            if (!current.equals(previous)) {
                groups++;
            }

            previous = current;
        }

        System.out.println(groups);

        sc.close();
    }
}