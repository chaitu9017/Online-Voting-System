package ClassWork;
// the Collatz sequence (also known as the 3n + 1 sequence) starting from n = 6
// Start with n = 6.
// Repeat until n becomes 1:
// If n is even, divide it by 2.
// If n is odd, calculate 3 × n + 1.
// Print each value in the sequence.
// Output>
// 6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

class day2first {
    public static void main(String[] args) { 
        int n = 6;

        while (n != 1) {
            System.out.print(n + " -> ");

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        System.out.println(1);
    }
}