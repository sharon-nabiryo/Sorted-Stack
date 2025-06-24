import java.util.Collections; // For sorting the list
import java.util.List;        // Interface for reuse
import java.util.Scanner;     // For user input
import java.util.Stack;       // Replaces LinkedList with Stack

/**
 * A program that reads integers from user input, stores them in a Stack,
 * sorts them in ascending order, and prints them.
 * <p>
 * This is a maintenance update of Project #4, which previously used LinkedList.
 * Now it uses Stack while maintaining the same structure and methods.
 * </p>
 * 
 * @author Sharon
 * @version 2.0
 */
public class SortedStack {

    /**
     * Main entry point of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers = readInput();  // Read user input
        sortList(numbers);                   // Sort numbers
        printList(numbers);                  // Print sorted list
    }

    /**
     * Reads integers from standard input and returns them in a Stack.
     *
     * @return a stack of integers from user input
     */
    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new Stack<>(); // Now using Stack instead of LinkedList
        System.out.println("Enter integers separated by space. Press Ctrl+D (or Ctrl+Z + Enter) to end:");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                scanner.next(); // Skip invalid input
            }
        }

        scanner.close();
        return numbers;
    }

    /**
     * Sorts the list of integers in ascending order.
     *
     * @param numbers the list to sort
     */
    public static void sortList(List<Integer> numbers) {
        Collections.sort(numbers); // Built-in sorting method
    }

    /**
     * Prints the sorted list of integers.
     *
     * @param numbers the list to print
     */
    public static void printList(List<Integer> numbers) {
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
