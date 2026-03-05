import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO)
 * - Stack (LIFO)
 *
 * @author Mukesh Vaithiya
 * @version 6.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            stack.push(c);      // LIFO
            queue.add(c);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare removing from both
        while (!stack.isEmpty() && !queue.isEmpty()) {

            char fromStack = stack.pop();   // last character
            char fromQueue = queue.remove(); // first character

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome ✅");
        } else {
            System.out.println("Result: The string is NOT a Palindrome ❌");
        }
    }
}
