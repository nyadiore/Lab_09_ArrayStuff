import java.util.Scanner;


public class SafeInput {
    public static int getRangedInt(Scanner scanner, String prompt, int min, int max) {
        int value;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value < min || value > max);
        return value;
    }
}
