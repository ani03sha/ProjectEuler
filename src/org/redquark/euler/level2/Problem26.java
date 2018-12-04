/*
 * A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators
 * 2 to 10 are given:
 *
 * 1/2	= 	0.5
 * 1/3	= 	0.(3)
 * 1/4	= 	0.25
 * 1/5	= 	0.2
 * 1/6	= 	0.1(6)
 * 1/7	= 	0.(142857)
 * 1/8	= 	0.125
 * 1/9	= 	0.(1)
 * 1/10	= 	0.1
 *
 * Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.
 *
 * Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 */


package org.redquark.euler.level2;

import java.util.HashSet;
import java.util.Set;

public class Problem26 {

    public static void main(String[] args) {

        int limit = 1000;
        int recurringMax = 0;
        int num = 0;

        Set<Integer> remainders = new HashSet<>();

        for (int i = 7; i < limit; i++) {

            // We od not need to divide numbers that are divisible by 2 and 5
            if (i % 2 != 0 && i % 5 != 0) {
                int d = 1;
                boolean flag = true;
                while (flag) {
                    int r = d % i;
                    d = r * 10 % i;
                    // The add operation in the set will give false if we try to add a repeating digit in the set.
                    flag = remainders.add(d);

                    if (!flag) {
                        int max = remainders.size();
                        if (max > recurringMax) {
                            recurringMax = max;
                            num = i;
                        }
                    }
                }
                remainders.clear();
            }
        }
        System.out.println(num);
    }
}
