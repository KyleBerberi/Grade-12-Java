package PersonalQuestions;

import java.util.Scanner;
import java.lang.StringBuilder;


public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A SENTENCE: ");
        String sentence = sc.nextLine();
        sb.append(sentence);
        sb.reverse();
        String finalstring = sb.toString();
        System.out.println(finalstring);

    }
}

