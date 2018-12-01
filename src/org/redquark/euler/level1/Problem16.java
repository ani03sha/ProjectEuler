/*
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */


package org.redquark.euler.level1;

import java.math.BigInteger;

public class Problem16 {

    public static void main(String[] args) {

        BigInteger bi = new BigInteger("2").pow(1000);
        String result = bi.toString();
        int sum = 0;

        for (int i = result.length() - 1; i >= 0; i--) {
            sum = sum + Character.getNumericValue(result.charAt(i));
        }

        System.out.println(sum);
    }
}
