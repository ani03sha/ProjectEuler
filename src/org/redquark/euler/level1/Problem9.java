/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */


package org.redquark.euler.level1;

public class Problem9 {

    public static void main(String[] args) {

        // Since a<b<c, a<1000/3, a<b<1000/2
        for (int i = 1; i < 1000 / 3; i++) {

            for (int j = i; j < 1000 / 2; j++) {

                int k = 1000 - i - j;

                if ((i * i + j * j == k * k)) {

                    System.out.println(i * j * k);

                    break;
                }
            }
        }
    }
}