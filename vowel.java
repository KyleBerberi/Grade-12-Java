package PersonalQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("I");
        arrayList.add("O");
        arrayList.add("U");
        arrayList.add("Y");
        System.out.println("Enter a letter: ");
        String input = sc.nextLine();
        String searchString = input;
        boolean exists = arrayList.contains(searchString);
        if (exists) {
            System.out.println(input + " IS A VOWEL");
        }
        else {
            System.out.println(input + " IS NOT A VOWEL");
        }


    }
}
