package ClassWork;
// If you have groups of the same character and want to add only the even lengths, here's how it works.
// Example>
// Input:

// aaabbccccdd
// Groups:

// aaa → length = 3 (odd, ignore)
// bb → length = 2 (even, add)
// cccc → length = 4 (even, add)
// dd → length = 2 (even, add)

// Sum of even lengths:

// 2 + 4 + 2 = 8


import java.util.Scanner;

public class day2third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int sum = 0;
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                System.out.println(str.charAt(i - 1) + " -> " + count);

                if (count % 2 == 0) {
                    sum += count;
                }

                count = 1;
            }
        }

        System.out.println("Sum of even lengths = " + sum);

        sc.close();
    }
}
