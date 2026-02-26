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
public class PalindromeCheckerApp
/**
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =============================================================
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 */public static void main(String[] args) {
    // Example input for validation
    String input = "radar";
    String reversed = "";

    // Iterate from the last character to the first
    for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
    }

    // Comparison logic
    if (input.equals(reversed)) {
        System.out.println(input + " is a palindrome.");
    } else {
        System.out.println(input + " is NOT a palindrome.");
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