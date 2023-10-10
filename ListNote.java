package MissNote;

import java.util.ArrayList;
import java.util.Scanner;

// video: https://youtu.be/hqslHSOmBEE
class ListNote {
    public ListNote() {
        // Example 1 - Using ArrayLists – resizable data structure
        // Give ArrayList a parameter in <> as best practise to tell Java what the ArrayList will hold
        ArrayList<String> names = new ArrayList<String>();
        names.add("Stella");
        names.add("Steven");
        names.add(2, "Lisa");

        // get and print element at index 1
        System.out.println(names.get(1));
        // remove element at index 1
        names.remove(1);

        // find and store the AL size
        int size = names.size();
        System.out.println(size);

        // other common methods:
        names.clear();             // clear the AL
        size = names.size();
        System.out.println(size);  // check that the AL was cleared

        // Example 2 – ArrayList of Integers
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            nums.add(i);   // "autoboxes" Integer from int type automatically
            //same as: nums.add(Integer.valueOf(i)) OR nums.add(new Integer(i))
        }

        System.out.println("Printing nums:...");
        for(int i = 0; i < nums.size(); i++) {
            int mark = nums.get(i); // same as: nums.get(i).intValue();
            // Java "unboxes" the Integer in the AL to a primitive int value
            System.out.println(mark);
        }
        // Note: You can use enhanced for/for-each loops to iterate over ArrayLists!

        // EXERCISE SOLUTIONS
        // A1 - Colours of the Rainbow
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("Violet");
        int index = colours.indexOf("Green");
        for (String colour : colours) {
            System.out.format("%s ", colour);
        }
        System.out.format("%nIndex of green is: %d%n", index);
        names.clear();

        // A2 - Array of Names
        names = new ArrayList<String>();
        names.add("Eric");
        names.add("Isaac");
        names.add("Gema");
        names.add("Hassan");
        names.add("Leila");
        System.out.format("Names:");
        for (String name : names) {
            System.out.format("%s ", name);
        }
        String key = "Isaac";
        System.out.format("%nMy name: %s%n", key);
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(key)) {
                names.remove(i);
            }
        }

        System.out.format("Names:");
        for (String name : names) {
            System.out.format("%s ", name);
        }

        // A3 - Insertion
        String insertName = "Reid";
        System.out.format("%nInserting name: %s%n", insertName);
        names.add(2, insertName);
        System.out.format("Names:");
        for (String name : names) {
            System.out.format("%s ", name);
        }

        // A4 - First and Last
        System.out.format("%nNames:");
        for (String name : names) {
            System.out.format("%s ", name);
        }
        if (!names.isEmpty()) {
            System.out.format("%nFirst: %s", names.get(0));
            System.out.format("%nLast: %s", names.get(names.size() - 1));
        }

        // A5 - Replacement - replace the 2nd element
        System.out.format("%nNames:");
        for (String name : names) {
            System.out.format("%s ", name);
        }
        if (names.size() >= 2) {
            names.set(1, "Eva");
        }
        System.out.format("%nNames after replacement: ");
        for (String name : names) {
            System.out.format("%s ", name);
        }

        // A6 - Reverse print
        System.out.format("%nNames:");
        for (String name : names) {
            System.out.format("%s ", name);
        }
        System.out.format("%nNames in reverse: ");
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.format("%s ", names.get(i));
        }

        // B1 - Mark Tracker
        ArrayList<Integer> marks = new ArrayList<Integer>();
        System.out.format("%nEnter your marks: %n");
        Scanner sc = new Scanner(System.in);
        int entry = sc.nextInt();

        while (entry != -1) {
            marks.add(entry); // Java is autoboxing at this step to convert an int to Integer
            entry = sc.nextInt();
        }
        System.out.format("%nYour marks are: ");
        for (Integer mark : marks) {
            System.out.format("%d ", mark);
        }

        // B2 - Compare 2 ArrayLists for Equality
        nums.clear();
        //	ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(21);
        nums.add(35);

        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(12);
        nums2.add(21);
        nums2.add(32); // change this to a 35 to make the lists equal
        // nums2.add(43); // add this in to make the lists different lengths, still not equal

        if (nums.size() != nums2.size()) {
            System.out.format("%nLists are not equal - different sizes!%n");
        } else {
            boolean equal = true;	// turn to false if you find 2 elements that are !=
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) != nums2.get(i)) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                System.out.format("%nLists are equal!%n");
            } else {
                System.out.format("%nLists are not equal%n");

            }

        }

        // B3 - Copy & Reverse
        int[] values = { 35, 56, 98, 104, 99 }; // try with an odd and even number in the array
        ArrayList<Integer> vals = new ArrayList<Integer>();
        // copy values into vals
        for (int i = 0; i < values.length; i++) {
            vals.add(values[i]);
        }
        System.out.format("%nValues are: ");
        for (Integer temp : vals) {
            System.out.format("%d ", temp);
        }

        for (int i = 0; i < vals.size() / 2; i++) {
            int temp = vals.get(i);
            vals.set(i, vals.get(vals.size() - i - 1));
            vals.set(vals.size() - i - 1, temp);
        }

        System.out.format("%nValues reversed are: ");
        for (Integer temp : vals) {
            System.out.format("%d ", temp);
        }

        // B4 - Shift Left
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("TEJ3M");
        courses.add("ICS3U");
        courses.add("ICS2O");
        courses.add("ICS3C");

        if (!courses.isEmpty()) {
            String temp = courses.get(0);
            for (int i = 0; i < courses.size()-1; i++) {
                courses.set(i, courses.get(i + 1));
            }
            courses.set(courses.size()-1, temp);
        }

        // B5 - Smallest First
        ArrayList<Integer> intAL = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intAL.add((int) (Math.random() * 101));
        }
        // make sure the ArrayList is populated
        if (!intAL.isEmpty()) {

            // find the smallest element in the AL
            System.out.format("%nYour Integer ArrayList is: ");
            // assume that the first element is the smallest to start
            Integer min = intAL.get(0);
            index = 0;
            for (int i = 0; i < intAL.size(); i++) {
                System.out.format("%d ", intAL.get(i));
                // compare the current element to the previous smallest
                if (intAL.get(i) < min) {
                    min = intAL.get(i);
                    index = i;
                }
            }
            // remove the min element and move it to the 1st pos'n, index 0
            intAL.remove(index);
            intAL.add(0, min);

            // print the updated list
            System.out.format("%nYour updated Integer ArrayList is: ");
            for (int i = 0; i < intAL.size(); i++) {
                System.out.format("%d ", intAL.get(i));
            }
        }

        // C1 - Longest String
        ArrayList<String> provinces = new ArrayList<String>();
        provinces.add("Prince Edward Island");
        provinces.add("Nova Scotia");
        provinces.add("New Brunswick");
        provinces.add("Newfoundland");
        provinces.add("Quebec");
        provinces.add("Ontario");
        provinces.add("Manitoba");
        provinces.add("Saskatchewan");
        provinces.add("Alberta");
        provinces.add("British Columbia");

        if (!provinces.isEmpty()) {
            int maxSize = provinces.get(0).length();
            index = 0;
            for (int i = 0; i < provinces.size(); i++) {
                if (provinces.get(i).length() > maxSize) {
                    maxSize = provinces.get(i).length();
                    index = i;
                }
            }

            System.out.format("%nThe province with the longest name of %d chars is %s%n", maxSize, provinces.get(index));
        }

        // C2 - Delete Short Strings
        if (!provinces.isEmpty()) {
            /*************IMPORTANT****************
             * When removing elements from an AL, loop from the end of the list to the start.
             * If you loop from the start and you remove an element from the AL, remaining elements
             * are shifted left, while the i index is updated to move one position right, causing
             * the element that was originally to the right of the element removed to be skipped.
             * Always loop from the end to the start when removing elements to prevent this issue.
             * Need more convincing?  Modify the below for loop to loop start to end, and watch the effects.
             */
            for (int i = provinces.size()-1; i >=0; i--) {
                if (provinces.get(i).length() < 10) {
                    provinces.remove(i);
                }
            }
            System.out.format("%nRemaining provinces with 10+ chars in their names: %n ");
            // printing after the removal is done to display the complete list, ensuring removal of elements was successful
            for(String province:provinces) {
                System.out.format("%s%n ", province);
            }
        }

    }



    public static void main(String[] args) {
        new ListNote();
    }
}