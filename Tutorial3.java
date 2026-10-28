public class Tutorial3 {
    public static void main(String[] args) {
        System.out.println("=== WIX1002 Tutorial 3: Flow of Control (Selection) ===");
        
        // --- QUESTION 1: Write statements for each of the following ---
        System.out.println("\n--- Question 1 ---");
        // a. Determine whether 3x8=27
        boolean q1a = (3 * 8 == 27);
        System.out.println("1a. Is 3x8 == 27? " + q1a);

        // b. Determine whether an input integer is odd or even
        int num = 4; // Change this value to test
        if (num % 2 == 0) {
            System.out.println("1b. " + num + " is an even number.");
        } else {
            System.out.println("1b. " + num + " is an odd number.");
        }

        // c. Determine whether a character is a capital letter
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("1c. '" + ch + "' is a capital letter.");
        } else {
            System.out.println("1c. '" + ch + "' is not a capital letter.");
        }

        // d. Display two strings in alphabetical order ignoring case
        String str1 = "banana";
        String str2 = "Apple";
        if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println("1d. " + str1 + ", " + str2);
        } else {
            System.out.println("1d. " + str2 + ", " + str1);
        }

        // e. Switch statement for days (0: Sunday, 1: Monday, ..., 6: Saturday)
        int dayCode = 2; // Example input
        switch (dayCode) {
            case 0: System.out.println("1e. Sunday"); break;
            case 1: System.out.println("1e. Monday"); break;
            case 2: System.out.println("1e. Tuesday"); break;
            case 3: System.out.println("1e. Wednesday"); break;
            case 4: System.out.println("1e. Thursday"); break;
            case 5: System.out.println("1e. Friday"); break;
            case 6: System.out.println("1e. Saturday"); break;
            default: System.out.println("1e. Invalid day code");
        }


        // --- QUESTION 2: Correct the errors ---
        System.out.println("\n--- Question 2 (Corrections) ---");
        // 2a Correction: use '==' instead of '=' for comparison
        int num1 = 5, num2 = 5;
        if (num1 == num2) {
            System.out.println("2a. Number 1 is equal to number 2.");
        }

        // 2b Correction: Java doesn't chain inequality like x > y > z; use logical AND (&&)
        int x = 15, y = 10, z = 5;
        if (x > y && y > z) {
            System.out.println("2b. x is the largest number");
        }

        // 2c Correction: use .equals() for strings, and '!=' for inequality check
        String s1 = "Hello", s2 = "Hello";
        if (s1.equals(s2)) {
            System.out.println("2c. They are equal strings.");
        } else {
            System.out.println("2c. They are not equal strings.");
        }

        // 2d Correction: remove rogue semicolon after if condition, use '||' for 'or'
        if (x > 0 || y > 0) {
            System.out.println("2d. Either x or y is positive");
        }


        // --- QUESTION 3: Outputs for x=9 and y=10 ---
        System.out.println("\n--- Question 3 (Outputs) ---");
        // We will execute them and print the results matching the logic:
        int x3 = 9, y3 = 10;
        
        // 3a output demonstration
        // if (x3 < 10) -> true
        //   if (y3 > 10) -> false -> else block matches inner if
        // Output:
        // #####
        // $$$$$
        System.out.println("3a Output:");
        if (x3 < 10)
            if (y3 > 10)
                System.out.println("******");
            else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }

        // 3b output demonstration
        System.out.println("3b Output:");
        if (x3 < 10) {
            if (y3 < 10) {
                System.out.println("******");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }

        // 3c output demonstration
        System.out.println("3c Output:");
        if (x3 < 10) {
            if (y3 < 10)
                System.out.println("******");
            System.out.println("#####"); // Note: this line is outside the inner if!
        } else {
            System.out.println("$$$$$");
        }

        // 3d output demonstration
        System.out.println("3d Output:");
        if (x3 > 10) {
            if (y3 > 10) {
                System.out.println("******");
                System.out.println("#####"); 
            }
        } else {
            System.out.println("$$$$$"); // Matches outer 'if (x3 > 10)' false block
        }


        // --- QUESTION 4: Biggest number among three given integers ---
        System.out.println("\n--- Question 4 ---");
        int a = 12, b = 25, c = 18;
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("The biggest number among " + a + ", " + b + ", " + c + " is: " + max);


        // --- QUESTION 5: Determine whether a Leap Year ---
        System.out.println("\n--- Question 5 ---");
        int year = 2024;
        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }
        
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}