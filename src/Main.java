import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

public class PalindromeCheckerApp /**
 * =========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * ArunSriramGudla
 * @version 2.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // 1. Store a predefined string
        String text = "madam";

        // 2. Compare characters from both ends
        boolean isPalindrome = true;
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // 3. Display the result
        if (isPalindrome) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is NOT a palindrome.");
        }
    }
}
/**
 * ============================================
 * MAIN CLASS - UseCase1PalindromeApp
 * ============================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 * The goal is to establish a clear startup flow.
 *
 * @dhiraj
 * @version 1.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point
     * This is the first method executed by the JVM
     */
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Application Version: 1.0");

        String input = "MADAM";

        String reversed = new StringBuilder(input)
                .reverse()
                .toString();

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}