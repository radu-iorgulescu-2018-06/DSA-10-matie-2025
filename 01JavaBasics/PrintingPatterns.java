public class PrintingPatterns {

        public static void printRightAngleTriangle(int numberOfRows) {

            if (numberOfRows <= 0) {
                System.out.println(x: "Numarul de randuri trebuie sa fie pozitiv");
                return;
            }
            
            int currentNumber = 1;

            for (int row = 1; row <= numberOfRows; row++) {
                for (int column = 1; column <= row; column++) {
                    System.out.print(currentNumber + "*");
                    currentNumber++;
                }
                System.out.println(); //Enter/CR
            }
        }

        public static void printPyramid(int n) {
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            

            printPyramid(5);
            printRightAngleTriangle(-11);
            printRightAngleTriangle(0);

            printRightAngleTriangle(1);
            printRightAngleTriangle(3);
            printRightAngleTriangle(5);           
            //printRightAngleTriangle(n5);
        }
}
