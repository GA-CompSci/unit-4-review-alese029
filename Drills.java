
    public static void main(String[] args) {

        // Declare 5 different data types with initial values
        int x = 5;
        char y = 'g'; // 'g' should be in single quotes since it's a char
        boolean z = true;
        double g = 5.00;
        int[] myArray = {5, 6, 7, 9};
        String n = "George"; // Added missing semicolon

        // A standard for loop printing a message three times
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }

        // A for-each loop traversing an array
        for (int i : myArray) {
            System.out.println(i); // No need for myArray[i], just use i in the enhanced for loop
        }

        // A for-each loop for traversing a String array
        String[] names = {"Sophia", "Drexel", "Pete"};
        for (String name : names) {
            System.out.println(name); // This needs to be inside the loop
        }

        // An infinite loop (correct as-is)
        while (true) {
            // To avoid a real infinite loop, add a condition or break statement if needed.
            break; // Example break to prevent actual infinite loop during testing
        }

        // A short-circuit conditional with four tests
        if (true || false) {
            System.out.println("Hello");
            // Removed "break" since it's not in a loop here.
        }

        // Loop through each character in the string 'n'
        for (int i = 0; i < n.length(); i++) {
            System.out.println(n.charAt(i));
        }

        // Print only the first three letters in a word
        String word = "Example"; // Added a sample word
        System.out.println(word.substring(0, 3)); // Corrected missing variable declaration

        // Print all the odd numbers from 1 - 100
        for (int i = 1; i <= 100; i++) { // Corrected loop condition to print up to 100
            if (i % 2 != 0) {
                System.out.println(i); // Print only if the number is odd
            }
        }

        // Create a Scanner and take an input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = s.nextLine();
        System.out.println("Hello, " + userName + "!");

        // Take a number and count down from that number to 0
        for (int k = 50; k >= 0; k--) { // Corrected the loop variable decrement (k--)
            System.out.println(k);
        }
    }

    /**
     * Checks if the parameter is even.
     * @param num the number to check
     * @return true if the given int is even, false otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0; // Corrected the syntax to check even numbers
    }
}
