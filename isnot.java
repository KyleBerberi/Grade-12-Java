package PersonalQuestions;

import java.util.Scanner;

public class isnot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String result = replaceIsWithIsNot(input);
        System.out.println("Modified string: " + result);
    }

    public static String replaceIsWithIsNot(String input) {
        StringBuilder modified = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            if (i + 1 < input.length() && input.substring(i, i + 2).equalsIgnoreCase("is")) {
                // Check if "is" is not immediately preceded or followed by a letter
                if ((i == 0 || !Character.isLetter(input.charAt(i - 1))) &&
                        (i + 2 == input.length() || !Character.isLetter(input.charAt(i + 2)))) {
                    modified.append("is not");
                    i += 2; // Skip to the character after "is"
                } else {
                    modified.append(input.charAt(i));
                    i++;
                }
            } else {
                modified.append(input.charAt(i));
                i++;
            }
        }

        return modified.toString();
    }
}
