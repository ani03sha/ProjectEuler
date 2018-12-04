/*
 * Euler discovered the remarkable quadratic formula:
 *
 * n^2+n+41
 * It turns out that the formula will produce 40 primes for the consecutive integer values 0≤n≤39.
 * However, when n=40,40^2+40+41=40(40+1)+41 is divisible by 41, and certainly when n=41,41^2+41+41
 * is clearly divisible by 41.
 *
 * The incredible formula n^2−79n+1601 was discovered, which produces 80 primes for the consecutive values 0≤n≤79.
 * The product of the coefficients, −79 and 1601, is −126479.
 *
 * Considering quadratics of the form:
 *
 * n^2+an+b, where |a|<1000 and |b|≤1000
 *
 * where |n| is the modulus/absolute value of n
 * e.g. |11|=11 and |−4|=4
 * Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n=0.
 */


package org.redquark.euler.level2;

public class Problem27 {

    public static void main(String[] args) {

        int limit = 1000;
        int a = 0;
        int b = 0;
        int n = 0;

        for (int i = -limit; i <= limit; i++) {
            for (int j = -limit; j <= limit; j++) {
                int num = 0;
                while (isPrime(Math.abs(num * num + i * num + j))) {
                    num++;
                }
                if (num > n) {
                    a = i;
                    b = j;
                    n = num;
                }
            }
        }
        System.out.println(a * b);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
