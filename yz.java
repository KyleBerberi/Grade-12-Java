package PersonalQuestions;

import java.util.Scanner;

public class yz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int count = countWordsEndingInYorZ(input);
        System.out.println("Number of words ending in 'y' or 'z': " + count);
    }

    public static int countWordsEndingInYorZ(String input) {
        // Split the input string into words using whitespace as a delimiter
        String[] words = input.split("\\s+");

        // Initialize a count to keep track of words ending in 'y' or 'z'
        int count = 0;

        // Iterate through the words and check if each word ends with 'y' or 'z'
        for (String word : words) {
            // Remove any non-alphabetic characters from the end of the word
            word = word.replaceAll("[^a-zA-Z]+$", "");

            // Check if the modified word ends with 'y' or 'z' (case-insensitive)
            if (word.matches(".*[yYzZ]$")) {
                count++;
            }
        }

        return count;
    }
}
