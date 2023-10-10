package MissNote;

import java.util.*;

class FormattingOutput {
    public static void main(String[] args) {
        // Used to format output nicely and consistently - great for tabular data formatting e.g. receipt, table, etc.
        // %n at the end of each 'sentence' inserts a new line
        // can be used anywhere inside the ""

        Scanner sc = new Scanner(System.in);
        System.out.format("Enter your name: ");
        String name = sc.nextLine();

        System.out.format("Enter your age:");
        int age = sc.nextInt();

        // In S.o.f. placeholders called converters tell the string what
        // vars will be expected
        // Converters are placeholders - add in all data at the end of "" in a comma-separated list
        System.out.format("Hello %s, you are %d years old.%n", name, age);
        // %10s - 10 padding w right-justified text
        System.out.format("%10s%n%10s%n", name, "Jimmy");
        // %.3s - outputs only the first n (3) letters
        System.out.format("Hello, %.3s%n", name);

        float pi = 3.141593f;
        // %f - use for floating pt #s; .4 > 4 decimal places; will round!
        System.out.format("%f %n%.4f %n", pi, pi);
        // 10 padding, 2 decimal places, left-justified
        System.out.format("%10.2f%n",  pi);
        // 20 padding, 0 filled, 3 decimal places
        System.out.format("%020.3f%n", pi);
        // 10 padding, 2 decimals, sign displayed
        System.out.format("%+10.2f%n",  pi);
        // 10 padding, 2 decimals, sign displayed, left-justified
        System.out.format("%+-10.2f%n",  pi);
		/*
    Last name     First name   age   grade    amount
      Omstead         Lauren   100   10       56.50
          Ali            Ava */
        // Complete list of converters & flags:
        // https://docs.oracle.com/javase/tutorial/java/data/numberformat.html


        // Exercise Solutions:

        // Question 1
        System.out.printf("%n%-15s%15s%15s%15s%15s%n", "Last", "First", "Age", "Grade", "Amount");
        System.out.printf("%-15s%15s%15d%15d%15.2f%n", "Ahmad", "Ali", 17, 12, 150.50);
        System.out.printf("%-15s%15s%15d%15d%15.2f%n", "Tennison", "Ava", 17, 12, 75.34);
        System.out.printf("%-15s%15s%15d%15d%15.2f%n", "Rossi", "Sylvester", 17, 12, 50.05);
        System.out.printf("%-15s%15s%15d%15d%15.2f%n", "Horvat", "Vesna", 17, 12, 125.45);
        System.out.printf("%-15s%15s%15d%15d%15.2f%n", "Dhillon", "Ravi", 17, 12, 25.25);
    /* Alternate solution that stores names in list
		int i = 0;

		List<String> firstNames = Arrays.asList("Ali", "Ava", "Sylvester", "Horvat", "Ravi");
		List<String> lastNames = Arrays.asList("Ahmad", "Tennison", "Rossi", "Vesna", "Dhillon");
		List<Integer> ages = Arrays.asList(17, 17, 17, 18, 17);
		List<Integer> grade = Arrays.asList(12, 12, 12, 12, 12);
		List<Double> amount = Arrays.asList(150.5, 65.3, 72.25, 31.78, 85.65);

		System.out.printf("%n%15s%15s%15s%15s%15s%n", "Last", "First", "Age", "Grade", "Amount");

		while (i < 5) {
			System.out.printf("%15s%15s%15d%15d%15.2f%n", firstNames.get(i), lastNames.get(i), ages.get(i), grade.get(i), amount.get(i));
			i++;
		}
		System.out.printf("%n");
		*/
        // Question 2
        float burger = 4.99f;
        float fries = 1.99f;
        float drink = .99f;
        System.out.printf("Please order below!%n");
        System.out.printf("Burger(s):%n");
        int quantBurger = sc.nextInt();
        System.out.printf("Fries:%n");
        int quantFries = sc.nextInt();
        System.out.printf("Drink(s):%n");
        int quantDrink = sc.nextInt();

        float burgerSub = quantBurger * burger;
        float friesSub = quantFries * fries;
        float drinkSub = quantDrink * drink;
        float subtotal = burgerSub + friesSub + drinkSub;

        float tax = subtotal * .13f;
        float total = subtotal + tax;

        System.out.printf("%10s%10s%10s%n%n%10s%10d%10.2f%n%10s%10d%10.2f%n%10s%10d%10.2f%n%n", "Item(s)", "Quantity", "Cost $", "Burger", quantBurger, burgerSub, "Fries", quantFries, friesSub, "Drink", quantDrink, drinkSub);
        System.out.printf("%20s%10.2f%n%20s%10.2f%n%20s%10.2f", "Subtotal:", subtotal, "Tax:", tax, "Total", total);

        sc.close();
    }
}