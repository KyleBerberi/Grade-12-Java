package PersonalQuestions;

import java.util.Scanner;

class mirror {
    public static String findMirrorEnd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int length = input.length();

        // Start by checking for the longest possible mirror end
        for (int i = length; i >= 1; i--) {
            String prefix = input.substring(0, i);
            String reversed = new StringBuilder(prefix).reverse().toString();

            if (input.endsWith(reversed)) {
                return prefix;
            }
        }

        // If no mirror end is found, return an empty string
        return "";
    }

    public static void main(String[] args) {
        String mirrorEnd = findMirrorEnd();

        if (!mirrorEnd.isEmpty()) {
            System.out.println("Mirror end found: " + mirrorEnd);
        } else {
            System.out.println("No mirror end found.");
        }
    }
}
