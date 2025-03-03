import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean keepRolling = true;
        while (keepRolling) {
            int rollCount = 0;
            int die1, die2, die3;
            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("----------------------------------------------------------");
            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                rollCount++;
                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            if (!response.equals("yes")) {
                keepRolling = false;
            }
        }
        scanner.close();
    }
}
