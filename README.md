# SortedStack

## Description

`SortedStack.java` is a Java program that reads a list of integers from user input, stores them in a `Stack` using the Java Collections Framework, sorts them in ascending order, and prints the result.

This program is a maintenance update to `SortedLinkedList.java` (Project #4), demonstrating strong code reuse through the use of modular methods and general interfaces. For instance, the `readInput()` method remains unchanged and can be reused in any future program requiring numeric input. The `sortList()` method abstracts the sorting logic so it can be applied to any list of integers. Additionally, using the `List` interface instead of coding directly to `Stack` or `LinkedList` allows for seamless data structure changes—like this update from `LinkedList` to `Stack`—without rewriting core logic.

---

## Features

- Uses Java's `Stack` via the `List<Integer>` interface
- Sorts values using `Collections.sort()`
- Handles invalid (non-integer) input gracefully
- Modular design with reusable methods: `readInput()`, `sortList()`, and `printList()`
- Follows best practices and includes Javadoc comments
- Designed to preserve structure and minimize changes across maintenance tasks

---

## Command used for compiling program

javac SortedStack.java

### Input Instructions

After running the program: Command: java SortedStack

1. Type integers separated by spaces.
2. Press:
   - `Ctrl + D` (macOS/Linux)
   - or `Ctrl + Z`, then `Enter` (Windows)
     to signal the end of input.

---

### Command used for generating JavaDoc

To keep the directory clean, generate the documentation inside a folder named `docs`:

javadoc -d docs -author -version SortedStack.java
