package PersonalQuestions;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Rome {
    public static void main(String[] args) {
        HashMap<String, Integer> romannum = new HashMap<>();
        romannum.put("I", 1);
        romannum.put("V", 5);
        romannum.put("X", 10);
        romannum.put("L", 50);
        romannum.put("C", 100);
        romannum.put("D", 500);
        romannum.put("M", 1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman numerials (enter 'E' to finish):");
        while (true) {
            String numieral = sc.nextLine().toUpperCase();
            if (Objects.equals(numieral, "E")) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < numieral.length(); i++) {
                String letter = numieral.charAt(i) + "";
                if (romannum.containsKey(letter)) {
                    int value = romannum.get(letter);
                    sum += value;
                } else {
                    System.out.println("Letter '" + letter + "' not found in the HashMap.");
                }
            }
            System.out.println("Sum of values: " + sum);
        }
    }
}
