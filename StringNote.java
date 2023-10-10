package MissNote;// Video link: https://youtu.be/HfKYEzFHvFk
import java.util.Scanner;

class Main {
    public Main() {
        // STRING METHODS
        // Remember to use the dot operator on a string to look through all the available String methods
        String str = "All around the mulberry bush";
        if (str.length() > 0) {  // make sure there is a valid string before using any indices
            char c = str.charAt(0); // initial char in str
            System.out.println(c);
        } else {
            System.out.println("Invalid string");
        }

        // Comparing strings
        String sentence = "The lazy dog trips over the log";
        if(str.equals(sentence)) {  // OR: str.equalsIgnoreCase(sentence)
            System.out.println("The two sentences are the same");
        }
          
      /* Also available:
str.compareTo(sentence) to compare using lexicographical (alphabetical) order - it gives more info on the diff. b/w strings */

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // Find substrings of a String
        str = "Mrs. Smith";
        if(str.length() > 0) {	// check for a valid string
            // gets substr that includes beginIndex, excludes endIndex
            System.out.println(str.substring(0,3));
            // gets substr from beginIndex to end of String
            System.out.println(str.substring(5));
        }

        // Finding an index then getting a substring
        int index = sentence.indexOf(' ');  // find the first space
        String sub = sentence.substring(0,index); // use variables instead of hard-coded values where possible
        System.out.println("Substring is: .." +  sub + "..");

        // Strings and loops - these are often used together
        str = "Humpty Dumpty sat on a wall";
        // iterate over each char in the string
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // access a char of a string @ pos'n i
            System.out.println(c);
        }

        // EXERCISE SOLUTIONS
        // A1 - We're Twinsies!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = sc.next(); // only take the first token (word) the user entered on the line
        sc.nextLine(); // process/get rid of any other words and the Enter key that was left on the input
        if (name.equalsIgnoreCase("Mrs.")) {
            System.out.println("We're twins!");
        } else {
            System.out.println("Not a match!");
        }

        // A2 - Print last character of a string
        System.out.println("\nEnter a word");
        String word = sc.next();
        System.out.println("Length of word " + word + " is " + word.length());
        System.out.println("The last letter of this word is: " + word.charAt(word.length() - 1));
        sc.nextLine();

        // A3 - Spaces, Spaces, Everywhere!
        name = " John Smith ";
        System.out.println("\nName without spaces .." + name.trim() + ".."); // name with spaces
        System.out.println("Space index is " + name.indexOf(' '));

        // A4 - Find the Comma
        String location = "Toronto, Ontario";
        index = location.indexOf(',');
        System.out.println("\nCity: .." + location.substring(0, index) + "..");
        System.out.println("Province: .." + location.substring(index + 1).trim() + ".."); // omit any residual whitespace

        // B1 - Count the Vowels
        String sillySentence = "All around the mulberry bush";
        int vowels = 0;
        for (int i = 0; i < sillySentence.length(); i++) {
            char c = sillySentence.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'|| c == 'U')
                vowels++;
        }
        System.out.println("\nThere are " + vowels + " vowels in " + sillySentence);

        // Another solution
        String vowelsStr = "aeiouAEIOU";
        vowels = 0;
        for (int i = 0; i < sillySentence.length(); i++) {
            if(vowelsStr.indexOf(sillySentence.charAt(i)) != -1) {
                vowels++;
            }
        }
        System.out.println("\nThere are " + vowels + " vowels in " + sillySentence);

        // B2 - Triplets
        String original = "Hello";
        sub = original.substring(original.length() - 2);
        String triplets = sub + sub + sub;
        System.out.println("\nThe triplets of " + original + " are " + triplets);

        // B3 - Print letters of string in reverse
        // reuse the string from #2
        str = "Good morning coders!";
        System.out.print("\n\nString: " + str + " in reverse:");
        for (int i = str.length() - 1; i >= 0; i--) {
            // use S.o.print so all chars are on one line
            System.out.print(str.charAt(i));
        }
        System.out.println("");

        // B4 - BINGO
        String bingo = "BINGO";
        for (int i = 0; i < bingo.length(); i++) {
            System.out.println(bingo.substring(0, i + 1));
        }

        // B5 - Interleaving
        String str1 = "Ontario";
        String str2 = "Canada";
        // Figure out which string has longest length
        int len1 = str1.length();
        int len2 = str2.length();
        // Find the max of two values with the Math.max method
        int maxLength = Math.max(len1, len2);
        String interleaved = "";
        // iterate over the longest string's length
        for (int i = 0; i < maxLength; i++) {
            if (i <= len1 - 1) {
                interleaved += str1.substring(i, i + 1);
            }
            if (i <= len2 - 1) {
                interleaved += str2.substring(i, i + 1);
            }
        }
        System.out.println("\nInterleaving strings: " + str1 + " and " + str2 + " produces: " + interleaved);




    }
    public static void main(String[] args) {
        new Main();
    }
}