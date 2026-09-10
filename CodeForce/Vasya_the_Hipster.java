package CodeForce;

import java.util.*;

public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        int different = Math.min(a, b);

        int remaining = Math.abs(a - b);

        int same = remaining / 2;

        System.out.println(different + " " + same);
    }
}