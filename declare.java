package MissNote;
import java.util.Scanner;

public class declare {
    public static void main(String[] args){
        // DECLARE AND INITIALIZE STRINGS
        // Strings can hold special chars, #s and letters

        // Most efficient, preferred method to declare a String; stored in String pool
        String str = "The quick brown fox jumps over the lazy dog.";
        // Declared using constructor, less efficient as String is duplicated in heap and String pool
        String name = new String("Mrs. Smith");

        String str2 = null; // set to null, can still be used/compared etc.
        String str3 = ""; // empty string, length 0, can still be used/compared etc.

        int length = str.length(); // calculates & saves 43 in length
        System.out.println("Length of .." + str + ".. is: " + length);

        // using toString() to convert an object to a String for printing
        Integer num = Integer.valueOf(5);
        // this conversion happens automatically when you S.o.p. an Integer
        // but can be performed manually with the toString() method
        String output = "My integer number is: " + num.toString();
        System.out.println(output);

        // String concatenation - adding Strings together
        // Method 1: add a String literal to a var value
        str = "Smith";
        str = "Mrs. " + str;
        System.out.println("My name is: " + str);

        // Method 2: add two String literals
        String sentence = "The lazy dog " + "trips over the log";

        // Method 3: add two Strings using concat method
        sentence = sentence.concat(" and lands in a bog.");
        System.out.println(".." + sentence + "..");


        // EXERCISE SOLUTIONS
        // A1 - Practise Creating Strings
        // 2 String literals
        String firstName = "Mrs.";
        String lastName = "Omstead";
        // 2 Strings using new operator/constructor
        String studentID = "987654321";
        String hobby = "making things";
        System.out.format("%s %s ID %s enjoys %s%n", firstName, lastName, studentID, hobby);

        // A2 - Practise Concatenating Strings
        // Get 3 Strings from user
        Scanner sc = new Scanner(System.in);
        System.out.format("Please enter three Strings:%n");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String funnySentence = s1.concat(s2).concat(s3);
        System.out.format("%s%n", funnySentence);

        // A3 - Practise Creating String Literals with intern()
        String courseCode = new String("ICS3U");
        String internedCourseCode = courseCode.intern();
        String code = "ICS3U";
        System.out.format("%s", internedCourseCode == code);
    }
}