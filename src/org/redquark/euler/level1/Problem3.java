/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143?
 */


package org.redquark.euler.level1;

public class Problem3 {

    public static void main(String[] args) {

        // Number for which maximum prime factor needs to be found
        long n = 600851475143L;

        // Initializing the maximum factor to the lowest possible value of the Long
        long maxFactor = Long.MIN_VALUE;

        // Loop until divisor is less than dividend
        for (int i = 3; i <= n; i = i + 2) {

            // We need to check only if the number is divided by the current number
            if (n % i == 0) {

                // updated value of n
                n = n / i;

                // Updating the value of maxFactor
                maxFactor = i;
            }
        }
        System.out.println(maxFactor);
    }
}
