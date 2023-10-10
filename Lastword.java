package PersonalQuestions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Lastword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        String[] sentence = input.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(sentence));
        System.out.println(arrayList);
        int lastIndex = arrayList.size() - 1;
        String lastValue = arrayList.get(lastIndex);
        int length = lastValue.length();
        System.out.println("The last value is: " + lastValue + " and " + length + " long");


    }
}