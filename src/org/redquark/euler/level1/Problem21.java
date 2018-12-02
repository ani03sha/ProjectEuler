/*
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 *
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 */

package org.redquark.euler.level1;

public class Problem21 {

    public static void main(String[] args) {

        int finalSum = 0;
        for (int i = 2; i < 10000; i++) {
            int x = properDivisorSum(i);
            if (x > i) {
                if (properDivisorSum(x) == i) {
                    finalSum = finalSum + i + x;
                }
            }
        }
        System.out.println(finalSum);
    }

    private static boolean isAmicable(int m, int n) {
        return (properDivisorSum(m) == n && properDivisorSum(n) == m);
    }

    private static int properDivisorSum(int n) {

        int sum = 1;

        for (int i = 2; i < Math.sqrt(n); i++) {

            if (n % i == 0) {
                if (n / i == 0) {
                    sum = sum + i;
                } else {
                    sum = sum + i + n / i;
                }
            }
        }
        return sum;
    }
}
