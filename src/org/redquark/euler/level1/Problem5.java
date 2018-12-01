package org.redquark.euler.level1;

public class Problem5 {

    public static void main(String[] args) {

        // Maximum limit of numbers
        int maxLimit = 20;

        long smallestProduct = 1L;

        // Loop for each number until maxLimit
        for (int i = 2; i <= maxLimit; i++) {
            // Check if the number is prime
            if(isPrime(i)){
                int exponent = (int) (Math.log(maxLimit)/Math.log(i));
                smallestProduct = smallestProduct * (long)Math.pow(i, exponent);
            }
        }
        System.out.println(smallestProduct);
    }

    /**
     * Utility method to check if the number is prime
     */
    private static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}
