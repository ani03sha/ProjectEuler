/*
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits
 * 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
 * The lexicographic permutations of 0, 1 and 2 are:
 *
 * 012   021   102   120   201   210
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */


package org.redquark.euler.level1;

import java.util.ArrayList;
import java.util.List;

public class Problem24 {

    private static List<String> permutations;

    public static void main(String[] args) {

        String number = "0123456789";

        permutations = new ArrayList<>();

        getPermutations("", number);

        System.out.println(permutations.get(999999));
    }

    private static void getPermutations(String prefix, String actual) {

        int length = actual.length();

        if (length != 0) {
            for (int i = 0; i < length; i++) {
                getPermutations(prefix + actual.charAt(i),
                        actual.substring(0, i) + actual.substring(i + 1, length));
            }
        } else {
            permutations.add(prefix);
        }
    }
}
