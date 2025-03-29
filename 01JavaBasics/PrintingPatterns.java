public class PrintingPatterns {

        public static void printRightAngleTriangle(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
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
            int n = 5; // You can change n to any number to adjust the size
            //printRightAngleTriangle(n);
            printPyramid(n);
        }
}
