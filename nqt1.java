import java.util.Scanner;

public class nqt1 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Method to find the nth element of the series
    public static int getNthElement(int N) {
        // Initialize the series array
        int series[] = new int[N];
        series[0] = 1;  // First element is always 1

        // For N > 1, assign the second element as 1
        if (N > 1) {
            series[1] = 1;
        }

        // Loop through from the 3rd element (i=2), i.e., the 3rd position
        for (int i = 2; i < N; i++) {
            int pos = i + 1;  // Position is i+1 (1-based index)
            
            // If the position is prime, use power of 2
            if (isPrime(pos)) {
                series[i] = (int) Math.pow(2, i);  // Power of 2 for prime positions
            }
            // If the position is a perfect square, use power of 3
            else if (isPerfectSquare(pos)) {
                series[i] = (int) Math.pow(3, (int) Math.sqrt(pos) - 1);  // Power of 3 for perfect squares
            }
            // Otherwise, sum the previous two elements
            else {
                series[i] = series[i - 1] + series[i - 2];
            }
        }

        // Return the nth element
        return series[N - 1];
    }

    // Main method to get input and find the nth element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int result = getNthElement(N);
        System.out.println("The " + N + "th element is: " + result);
    }
}
