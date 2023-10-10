package PersonalQuestions;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        String numberAsString = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(numberAsString);
        reversed.reverse();
        String result = reversed.toString();
        int number = Integer.parseInt(result);
        if (number == x) {
            boolean palindrome = true;
            System.out.println(palindrome);
        } else {
            boolean palindrome = false;
            System.out.println(palindrome);

        }
    }
}
