package CodeForce;

import java.util.*;

public class AntonAndPolyhydron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            String shape = sc.next();

            switch (shape) {
                case "Tetrahedron":
                    total += 4;
                    break;

                case "Cube":
                    total += 6;
                    break;

                case "Octahedron":
                    total += 8;
                    break;

                case "Dodecahedron":
                    total += 12;
                    break;

                case "Icosahedron":
                    total += 20;
                    break;
            }
        }

        System.out.println(total);
    }
}