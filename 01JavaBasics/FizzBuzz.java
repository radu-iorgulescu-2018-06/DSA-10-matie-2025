//fara streams
package 01JavaBasics ;

public class FizzBuzz {
    
    // Static method to print FizzBuzz from 1 to 100
    public static void printFizzBuzz() {
        // Iterate from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                //continue ;
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
                //continue ;
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
                //continue ;
            }
            // If the number is not divisible by 3 or 5, print the number itself
            else {
                System.out.println(i);
            }
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Call the static method to print FizzBuzz
        printFizzBuzz();
    }
}
