package ClassWork;
import java.util.Random;
import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Stone Paper Scissors Game");
        System.out.println("Enter your choice:");
        System.out.println("1. Stone");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int userChoice = sc.nextInt();

        int computerChoice = random.nextInt(3) + 1;

        String[] choices = {"", "Stone", "Paper", "Scissors"};

        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("It's a Draw!");
        } 
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You Win!");
        } 
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}