package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] arr = s.split("\\+");
        Arrays.sort(arr);

        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print("+" + arr[i]);
        }

        sc.close();
    }
}
