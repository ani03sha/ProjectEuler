/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */


package org.redquark.euler.level1;

public class Problem10 {

    public static void main(String[] args) {

        long sum = 2;

        for (int i = 3; i <= 2000000; i = i + 2) {

            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    /**
     * Utility method to check if the number is prime
     */
    private static boolean isPrime(int n) {
        // Looping starts from 3 and jumps every two integers
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
