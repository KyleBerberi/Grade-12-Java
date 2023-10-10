package PersonalQuestions;

import java.util.Scanner;

public class equalorno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        boolean result = isEqualIsToNot(input);
        System.out.println("Is the number of 'is' equal to the number of 'not'? " + result);
    }

    public static boolean isEqualIsToNot(String input) {
        // Count the number of occurrences of "is" and "not" in the string
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.startsWith("is", i)) {
                isCount++;
                i++; // Skip the next character to avoid overlapping
            }
            if (input.startsWith("not", i)) {
                notCount++;
                i += 2; // Skip the next two characters to avoid overlapping
            }
        }

        // Check if the counts are equal
        return isCount == notCount;
    }
}
