import java.util.LinkedList;
import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input (optional but recommended)
        input = input.replaceAll("\\s+", "").toLowerCase();

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char ch : input.toCharArray()) {
            list.add(ch);
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The input string is a PALINDROME.");
        } else {
            System.out.println("The input string is NOT a palindrome.");
        }

        scanner.close();
    }
}