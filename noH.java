package PersonalQuestions;

import java.util.Scanner;

public class noH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        String targetLetter = "h";
        int firstIndex = input.indexOf(targetLetter);
        int lastIndex = input.lastIndexOf(targetLetter);

    }
}
