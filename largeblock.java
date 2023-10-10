package PersonalQuestions;

import java.util.Scanner;

public class largeblock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int largestBlockLength = findLargestBlockLength(input);
        System.out.println("Length of the largest block: " + largestBlockLength);
    }

    public static int findLargestBlockLength(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        int maxBlockLength = 1; // Initialize to 1 for the first character
        int currentBlockLength = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentBlockLength++;
                if (currentBlockLength > maxBlockLength) {
                    maxBlockLength = currentBlockLength;
                }
            } else {
                currentBlockLength = 1; // Reset for a new potential block
            }
        }

        return maxBlockLength;
    }
}
