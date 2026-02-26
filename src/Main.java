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
 */public static void main(String[] args) import java.util.Scanner;

/**
 * *
 * =========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =========================================================
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp public static void main(String[] args) import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        displayWelcomeMessage();

        // UC2
        checkHardcodedPalindrome();

        // UC3
        checkPalindromeUsingLoop();
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

        public class PalindromeCheckerApp {

            public static void main(String[] args) {

                // UC1
                displayWelcomeMessage();

                // UC2
                checkHardcodedPalindrome();

                // UC3
                checkPalindromeUsingLoop();

                // UC4
                checkPalindromeUsingTwoPointers();

                // UC5
                checkPalindromeUsingStack();

                // UC6
                checkPalindromeUsingQueueStack();

                System.out.println("Application is ready for palindrome processing...");
            }

            // ===== UC1 =====
            public static void displayWelcomeMessage() {
                System.out.println("=========================================");
                System.out.println("        PALINDROME CHECKER APP           ");
                System.out.println("=========================================");
                System.out.println("Application Version : 1.0.0");
                System.out.println("Developed for: Learning Git & Java");
                System.out.println("=========================================");
            }

            // ===== UC2 =====
            public static void checkHardcodedPalindrome() {
                String word = "madam";
                String reversed = new StringBuilder(word).reverse().toString();

                if (word.equals(reversed)) {
                    System.out.println("Result: " + word + " is a palindrome ✅");
                } else {
                    System.out.println("Result: " + word + " is NOT a palindrome ❌");
                }
            }

            // ===== UC3 =====
            public static void checkPalindromeUsingLoop() {
                String word = "racecar";
                String reversed = "";

                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }

                if (word.equals(reversed)) {
                    System.out.println("Result: " + word + " is a palindrome ✅");
                } else {
                    System.out.println("Result: " + word + " is NOT a palindrome ❌");
                }
            }

            // ===== UC4 =====
            public static void checkPalindromeUsingTwoPointers() {
                String word = "level";
                int left = 0;
                int right = word.length() - 1;
                boolean isPalindrome = true;

                while (left < right) {
                    if (word.charAt(left) != word.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPalindrome) {
                    System.out.println("Result: " + word + " is a palindrome ✅");
                } else {
                    System.out.println("Result: " + word + " is NOT a palindrome ❌");
                }
            }

            // ===== UC5 =====
            public static void checkPalindromeUsingStack() {
                String word = "deed";
                Stack<Character> stack = new Stack<>();

                for (char c : word.toCharArray()) {
                    stack.push(c);
                }

                String reversed = "";
                while (!stack.isEmpty()) {
                    reversed += stack.pop();
                }

                if (word.equals(reversed)) {
                    System.out.println("Result: " + word + " is a palindrome ✅");
                } else {
                    System.out.println("Result: " + word + " is NOT a palindrome ❌");
                }
            }

            // ===== UC6 =====
            public static void checkPalindromeUsingQueueStack() {
                String word = "level";
                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                for (char c : word.toCharArray()) {
                    queue.add(c);   // FIFO
                    stack.push(c);  // LIFO
                }

                boolean isPalindrome = true;

                while (!queue.isEmpty()) {
                    if (!queue.remove().equals(stack.pop())) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("Result: " + word + " is a palindrome ✅");
                } else {
                    System.out.println("Result: " + word + " is NOT a palindrome ❌");
                }
            }
        }
        // UC4
        checkPalindromeUsingTwoPointers();

        // UC5
        checkPalindromeUsingStack();

        System.out.println("Application is ready for palindrome processing...");
    }

    // ===== UC1 =====
    public static void displayWelcomeMessage() {
        System.out.println("=========================================");
        System.out.println("        PALINDROME CHECKER APP           ");
        System.out.println("=========================================");
        System.out.println("Application Version : 1.0.0");
        System.out.println("Developed for: Learning Git & Java");
        System.out.println("=========================================");
    }

    // ===== UC2 =====
    public static void checkHardcodedPalindrome() {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // ===== UC3 =====
    public static void checkPalindromeUsingLoop() {
        String word = "racecar";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // ===== UC4 =====
    public static void checkPalindromeUsingTwoPointers() {
        String word = "level";
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // ===== UC5 =====
    public static void checkPalindromeUsingStack() {
        String word = "deed";
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
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