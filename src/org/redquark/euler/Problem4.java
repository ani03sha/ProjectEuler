/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */


package org.redquark.euler;

public class Problem4 {

    public static void main(String[] args) {

        // Initialize the maximum palindrome
        int max = 0;

        // Upper limit of an n-digit number. Here, for 3-digit number, it will be 999
        int ul = 0;

        for (int i = 1; i <= 3; i++) {
            ul = ul * 10;
            ul = ul + 9;
        }

        // Lowe limit of n-digit number. Here, for 3-digit number, it will be 100
        int ll = ul / 10 + 1;

        // Outer loop to keep track of one number starting from ul and then decreasing
        for (int i = ul; i >= ll; i--) {

            // Inner loop to keep track of other number starting from where outer loop is starting
            for (int j = i; j >= ll; j--) {

                // Product of the pair (i, j)
                int product = i * j;

                // If the product is less than max, it means we have found our solution. Then break it.
                if (product < max) {
                    break;
                }

                // Storing the value of product
                int n = product;

                // Reverse of the number
                int reverse = 0;

                // Calculating reverse of product (n)
                while (n > 0) {
                    reverse = reverse * 10 + n % 10;
                    n = n / 10;
                }

                // Check if the number is palindrome and the product is greater than mx, then max needs to be updated
                if (product == reverse && product > max) {
                    max = product;
                }
            }
        }
        System.out.println(max);
    }
}
