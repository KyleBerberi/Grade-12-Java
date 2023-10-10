package MissNote;// Video: https://youtu.be/X22HsQMmQ60

import java.util.Scanner;

class sbNote {
    public sbNote() {
        /* StringBuilder class represents strings but allows for updates to contents */
        StringBuilder sb = new StringBuilder(); // initial capacity is 16
        sb.append("Computer Science");
        int capacity = sb.capacity();
        System.out.format("Capacity: %d with string: %s%n", capacity, sb);

        // Reverse the string
        sb.reverse();
        System.out.format("String reversed: %s%n", sb);
        sb.reverse(); // return to original order

        // Replace - startIndex (inclusive), endIndex (exclusive), string
        sb.replace(9, sb.length(), "Engineering");
        System.out.format("String with Science replaced with Engineering: %s%n", sb);

        // Insert a string - index, insertString
        sb.insert(sb.length(), " Technology");
        System.out.format("String with Technology: %s%n", sb);
        sb.insert(21, "TEJ3M ");
        System.out.format("String with TEJ3M: %s%n", sb);

        // substring method - 1st index is inclusive, 2nd index exclusive
        System.out.format("Substring - first word is: %s%n", sb.substring(0, sb.indexOf(" ")));
        sb.setLength(0);	// clear the SB
        System.out.format("StringBuilder length: %d%n", sb.length());

        // EXERCISE SOLUTIONS
        Scanner sc = new Scanner(System.in);

        // A1 - Glue a URL
        // could instead use a loop b/c you know there are 3 parts to this URL,
        // specified by the question
        System.out.format("%nPlease enter the three sections of your URL, separated by spaces:%n");
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        sb = new StringBuilder();
        sb.append(s1);
        sb.append(".");
        sb.append(s2);
        sb.append(".");
        sb.append(s3);
        sb.setLength(0);

        // sb.append(s1).append(".").append(s2).append(".").append(s3); // alternative way to append all in one step
        System.out.format("Your URL is: %s%n", sb);
        sc.nextLine(); // clear any extra tokens & the Enter key
        sb.setLength(0); // recycle the StringBuilder for the next question

    /* Alternative solution: Avoids the use of Strings altogether:

    StringBuilder url = new StringBuilder();
    System.out.format("Enter components of url: (separate with spaces) %n");
    url.append(sc.nextLine());
    int space1 = url.indexOf(" ");
    int space2 = url.indexOf(" ", space1 +1);
    url.replace(space1, space1+1, ".");
    url.replace(space2, space2+1, ".");
    System.out.format("Your url is %s%n", url);
    */

        // A2 - Comma-Separated Name
        System.out.format("Please enter your first and last name:%n");
        s1 = sc.next();
        s2 = sc.next();
        sb = new StringBuilder();
        sb.append(s2);
        sb.append(", ");
        sb.append(s1);
        System.out.format("Your comma-separated name is %s%n", sb);
        sc.nextLine(); // clear any extra tokens & the Enter key
        sb.setLength(0); // clear the SB

    /* Alternative solution:
    StringBuilder name = new StringBuilder();
    name.append(sc.next());
    name.insert(0, sc.next() + ", ");
    System.out.format("Comma-separated name: %n", name);
    */

        // A3 - Find the Middle Name
        s1 = "James";
        s2 = "Alex";
        s3 = "Smith";
        sb.append(s1);
        sb.append(" ");
        sb.append(s2);
        sb.append(" ");
        sb.append(s3);
        System.out.format("Names in a SB: ..%s..%n", sb);
        int index1 = sb.indexOf(" "); // find the first space in the name
        int index2 = sb.indexOf(" ", index1 + 1); // find the second space in the name
        System.out.format("Middle name on its own: ..%s..%n", sb.substring(index1 + 1, index2));
        sb.delete(index1, index2);
        System.out.format("Without the middle name: ..%s..%n", sb);

        // B1 - Find the Initials
        String myName = "Hal G. von Rilstone";
        StringBuilder initials = new StringBuilder();
        int length = myName.length();
        myName = myName.trim(); // trim whitespace off the string

        initials.append(myName.charAt(0));  // add the first initial to the SB
        int space = myName.indexOf(' ');  // find the first space in the name, if one exists

        while(space != -1) {        // while there are still spaces, there are still more names to process!
            initials.append(myName.charAt(space+1));  // append the initial after the space
            space = myName.indexOf(' ', space+1);   // look for the next space, after the most recent space

        }
        System.out.format("My initials are: %s%n", initials);

        // alternate solution - add in initials based on the assumption that they are uppercase letters.
        // Doesn't work for all names - like Lily van Bakker, where one part of last name is not uppercased
    /*for (int i = 0; i < length; i++) {
      if (Character.isUpperCase(myName.charAt(i))) {
        initials.append(myName.charAt(i));
      }
    }*/

        // alternate solution - add in initials based on assumption that there are 2 names/tokens and the initials are the first letter of each token
    /*
    initials.setLength(0);  // StringBuilder
    System.out.format("Enter your name: first last%n");
    initials.append(sc.next().charAt(0));
    initials.append(sc.next().charAt(0));
    System.out.format("Your initials are: %s%n", initials);
    */

        // B2 - Comma-Separated List
        StringBuilder names = new StringBuilder();
        // handles names separate by comma-space or just comma
        names.append("Liz, Lisa, Leila, Lee-Anne, Leslie, Lindsay, Linda, Lola, Linea, Linley");
        System.out.format("Original list of names, separated by commas:%n%s%n", names);
        for(int i = 0; i < names.length()-2; i++) {
            if(names.charAt(i) == ',') {
                // if there is a space after the comma
                if(names.charAt(i+1) == ' ') {
                    names.replace(i, i + 2, "\n");
                } else {
                    // no space after comma
                    names.replace(i, i+1, "\n");
                }
            }
        }

        // Alternate solution: searches for next , and replaces with \n
        int index = names.indexOf(",");
        // find the commas, replace with \n
        while (index != -1) {
            if(names.charAt(index+1) == ' ') {
                // format: "name, " - space after comma
                names.replace(index, index + 2, "\n");
            } else {
                // no space after comma
                names.replace(index, index + 1, "\n");
            }
            index++; // move to end of replacement text
            index = names.indexOf(",", index);
        }
        System.out.format("List of names is:%n%s", names);

        // See D2L discussion for Anagram solutions

    }
}