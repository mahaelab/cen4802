/**
 * @author Maha Elabbadi CEN-4802C
 * The Fibonacci class creates a method to calculate the nth Fibonacci number using recursion
 */
public class Fibonacci {

    /**
     * Returns the nth fibonacci number
     *
     * @param n is the position in the sequence
     * @return the fibonacci number at position n
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Main method to test the fibonacci method
     * @param args arguments used in main method
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number " + n + " is " + fibonacci(n));
    }
}
