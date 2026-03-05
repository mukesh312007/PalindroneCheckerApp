/**
 * ============================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * The goal is to teach extensible algorithm design.
 *
 * @author Developer
 * @version 12.0
 */

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}

/**
 * ============================================================
 * INTERFACE – PalindromeStrategy
 * ============================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */

interface PalindromeStrategy {

    boolean checkPalindrome(String input);
}

/**
 * ============================================================
 * CLASS – StackStrategy
 * ============================================================
 *
 * Implements palindrome checking using a Stack.
 */

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}