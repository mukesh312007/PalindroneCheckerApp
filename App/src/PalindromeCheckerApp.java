/**
 * ============================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * @author Mukesh Vaithiya
 * @version 2.0
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Mukesh Vaithiya
 * @version 5.0
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Mukesh Vaithiya
 * @version 9.0
 * @author Mukesh Vaithiya
 * @version 6.0
 * @version 12.0
 * @version 11.0
 * The goal is to establish a clear startup flow.
 *
 * @author Mukesh Vaithiya
 * @version 10.0
 * @version 1.0
 * @author Mukesh Vaithiya
 * @version 7.0
 * @version 4.0
 * @version 13.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Start time
        long startTime = System.nanoTime();

        // Palindrome logic
        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // End time
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        // Result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        System.out.println("Execution Time: " + duration + " nanoseconds");

        scanner.close();
    }
}
