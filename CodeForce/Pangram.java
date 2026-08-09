package CodeForce;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            alphabet[ch - 'a'] = true;
        }

        boolean pangram = true;

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                pangram = false;
                break;
            }
        }

        if (pangram) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}