/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10001st prime number?
 */


package org.redquark.euler;

public class Problem7 {

    public static void main(String[] args) {

        // Counter that counts upto 10001
        int counter = 1;

        // Initialized the prime variable with the first prime
        int prime = 2;

        // Looping until we reach the 10001st prime
        for (int i = 3; counter < 1000001; i = i + 2) {
            if (isPrime(i)) {
                prime = i;
                counter++;
            }
        }
        System.out.println(prime);
    }

    /**
     * Utility method to check if the number is prime
     */
    private static boolean isPrime(int n) {
        // Looping starts from 3 and jumps every two integers
        for (int i = 3; i < n; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
