/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are
 * 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 *
 *
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23
 * letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out
 * numbers is in compliance with British usage.
 */


package org.redquark.euler.level1;

import java.util.HashMap;
import java.util.Map;

public class Problem17 {

    private static Map<Integer, Integer> wordCount = new HashMap<>();

    public static void main(String[] args) {

        wordCount.put(1, "one".length());
        wordCount.put(2, "two".length());
        wordCount.put(3, "three".length());
        wordCount.put(4, "four".length());
        wordCount.put(5, "five".length());
        wordCount.put(6, "six".length());
        wordCount.put(7, "seven".length());
        wordCount.put(8, "eight".length());
        wordCount.put(9, "nine".length());
        wordCount.put(10, "ten".length());
        wordCount.put(11, "eleven".length());
        wordCount.put(12, "twelve".length());
        wordCount.put(13, "thirteen".length());
        wordCount.put(14, "fourteen".length());
        wordCount.put(15, "fifteen".length());
        wordCount.put(16, "sixteen".length());
        wordCount.put(17, "seventeen".length());
        wordCount.put(18, "eighteen".length());
        wordCount.put(19, "nineteen".length());
        wordCount.put(20, "twenty".length());
        wordCount.put(30, "thirty".length());
        wordCount.put(40, "forty".length());
        wordCount.put(50, "fifty".length());
        wordCount.put(60, "sixty".length());
        wordCount.put(70, "seventy".length());
        wordCount.put(80, "eighty".length());
        wordCount.put(90, "ninety".length());

        System.out.println(oneToNine() + tenToNineteen() + twentyToNinetyNine() + hundredToNineHundredNinetyNine() + "One Thousand".length() - 1);
    }

    private static int oneToNine() {
        int totalLetters = 0;
        for (int i = 1; i <= 9; i++) {
            totalLetters = totalLetters + wordCount.get(i);
        }
        return totalLetters;
    }

    private static int tenToNineteen() {
        int totalLetters = 0;
        for (int i = 10; i <= 19; i++) {
            totalLetters = totalLetters + wordCount.get(i);
        }
        return totalLetters;
    }

    private static int twentyToNinetyNine() {
        int totalLetters;
        int unitPlace = 0;
        int tensPlace = 0;
        for (int i = 20; i <= 99; i++) {
            int unit = i % 10;
            int tens = i / 10;
            if (unit != 0) {
                unitPlace = unitPlace + wordCount.get(unit);
            }
            tensPlace = tensPlace + wordCount.get(tens * 10);
        }
        totalLetters = tensPlace + 8 * oneToNine();
        return totalLetters;
    }

    private static int hundredToNineHundredNinetyNine() {
        return 9 * (oneToNine() + tenToNineteen() + twentyToNinetyNine()
                + "hundred".length()) + 891 * "hundredand".length() + oneToNine() * 100;
    }
}
