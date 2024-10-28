import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        // random values
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // 3 values
        for (int i = 0; i < 3; i++) {
            System.out.print(dataPoints[i]);
            if (i < 2) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        //  average of dataPoints
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
        int sum = 0;
        for (int value : dataPoints) {
            sum += value; // Add each value to the sum
        }
        // sum of the values
        System.out.println("The sum of the values in the dataPoints array is: " + sum);

        Scanner scanner = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(scanner, "Enter an integer value between 1 and 100: ", 1, 100);
        System.out.printf("You entered: "+userValue);

        // Count occurrences of userValue
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the dataPoints array.");

        // Second input for finding the index
        userValue = SafeInput.getRangedInt(scanner, "Enter another integer value between 1 and 100: ", 1, 100);

        // Loop to find the index of userValue
        boolean found = false; // Track if the value is found
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.println("The value " + userValue + " was found at array index: " + i);
                found = true;
                break; // Exit the loop when found
            }
        }

        // If the value was not found
        if (!found) {
            System.out.println("The value " + userValue + " was not found in the dataPoints array.");
        }

        // Find minimum and maximum values
        int min = dataPoints[0]; // Initial minimum
        int max = dataPoints[0]; // Initial maximum

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i]; // Update minimum
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i]; // Update maximum
            }
        }

        // Print the minimum and maximum values
        System.out.println("The minimum value in the dataPoints array is: " + min);
        System.out.println("The maximum value in the dataPoints array is: " + max);

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    // for the average
    public static double getAverage(int values[]) {
        double sum = 0;
        for (int value : values) {
            sum += value; // the sum
        }
        return sum / values.length; //  the average
    }


    }




