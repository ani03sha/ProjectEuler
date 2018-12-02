/*
 * You are given the following information, but you may prefer to do some research for yourself.
 *
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */


package org.redquark.euler.level1;

public class Problem19 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1901; i <= 2000; i++) {
            for (int j = 1; j <= 12; j++) {
                if (isSunday(i, j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isSunday(int year, int month) {
        if (year < 0 || year > 10000 || month < 1 || month > 12) {
            throw new IllegalArgumentException();
        }

        // Zeller's congruence algorithm
        int m = (month - 3 + 4800) % 4800;
        int y = (year + m / 12) % 400;
        m = m % 12;

        int result = (y + y / 4 - y / 100 + (13 * m + 2) / 5 + 1 + 2) % 7;

        return result == 0;
    }
}
