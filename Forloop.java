package MissNote;

import java.util.*;

class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 3 sections: (declaration/initialization; loop condition; update)
        // can parts leave empty - but reconsider use of for loop if this is the case
        for (int i = 0; i < 10; i++) {
            System.out.format("%d%n", i);
        }
        // i is out of scope outside the for block

        // generate 5 random number and output each & the total
        double total = 0;
        for (int i = 0; i < 5; i++) {
            double rand = Math.random() * 100;
            System.out.format("%f%n", rand);
            total += rand;
        }
        System.out.format("Total is: %f%n", total);

        // descending for loop
        for (int i = 50; i >= 0; i -= 5) {
            System.out.format("%d%n", i);
        }

        // EXERCISE SOLUTIONS

        // 1. count backwards from 200 to 100 (inclusive)
        for (int i = 200; i >= 100; i--) {
            System.out.format("%d%n", i);
        }

        // 2. Average 10 rand #s b/w 0 & 10, add together and dislpay the avg
        Random rand = new Random();
        float avg = 0;
        for (int i = 0; i < 10; i++) {
            int randNum = rand.nextInt(11);
            avg += randNum;
            System.out.format("Random number %d is %d%n", i, randNum);
        }
        avg = avg / 10;
        System.out.format("Average is: %f%n", avg);

        // 3.  Count up from 200 by 5s to 250
        for (int i = 200; i <= 250; i += 5) {
            System.out.format("%d%n", i);
        }

        // 4.	Create a method that accepts two ints, one that represents the starting value of a loop index and one that represents the ending value of the loop index.  Use these to loop the appropriate number of times.
        System.out.format("Please enter the starting index for your loop (int) %n");
        int startIndex = sc.nextInt();
        System.out.format("Please enter the ending index for your loop (int) %n");
        int endIndex = sc.nextInt();

        // start index is less than end index
        if (startIndex <= endIndex) {
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.format("%d%n", i);
            }
            // start index is higher than end index
        } else {
            for (int i = startIndex; i >= endIndex; i--) {
                System.out.format("%d%n", i);
            }
        }

        sc.close();

    }
}
