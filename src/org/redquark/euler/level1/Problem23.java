/*
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant
 * if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the
 * sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123
 * can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by
 * analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant
 * numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */


package org.redquark.euler.level1;

import java.util.ArrayList;
import java.util.List;

public class Problem23 {

    public static void main(String[] args) {

        int total = 0;
        int max = 28123;

        List<Integer> abundant = new ArrayList<>();

        for (int i = 1; i < max; i++) {
            if (isAbundant(i)) {
                abundant.add(i);
            }
        }

        boolean[] canBeAbundantSum = new boolean[max + 1];

        for (int i = 0; i < abundant.size(); i++) {
            for (int j = i; j < abundant.size(); j++) {
                if (abundant.get(i) + abundant.get(j) <= max) {
                    canBeAbundantSum[abundant.get(i) + abundant.get(j)] = true;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i <= max; i++) {
            if (!canBeAbundantSum[i]) {
                total = total + i;
            }
        }

        System.out.println(total);
    }

    private static boolean isAbundant(int n) {
        int d = properDivisorSum(n);
        return n < d;
    }

    private static int properDivisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    sum = sum + i;
                } else {
                    sum = sum + i;
                    sum = sum + n / i;
                }
            }
        }
        return sum - n;
    }
}
