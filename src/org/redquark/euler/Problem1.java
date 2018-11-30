/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

package org.redquark.euler;

public class Problem1 {

    public static void main(String[] args) {

        // Numbers divisible by 3 and less than 1000
        int a = (1000 - 1) / 3;
        // Numbers divisible by 5 and less than 1000
        int b = (1000 - 1) / 5;
        // Numbers divisible by 15 and less than 1000. (15 is the Lowest Common Multiple of 3 and 5)
        int c = (1000 - 1) / 15;

        // Calculating the sum using the formula for calculating the sum of first n natural numbers.
        // Sn = (n * (n + 1)) / 2
        // Here we are adding first n multiples of 3 and 5 which are less than 1000.
        // We need to subtract the first n multiples of 15 from the total sum as it is added twice because it comes both in multiples of 3 and 5.
        // To compute the actual result we need to subtract it once.
        int sum = 3 * (a * (a + 1) / 2) + 5 * (b * (b + 1) / 2) - 15 * (c * (c + 1) / 2);

        System.out.println(sum);
    }
}
