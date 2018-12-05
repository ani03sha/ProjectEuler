package org.redquark.euler.level2;

public class Problem30 {

    public static void main(String[] args) {

        int sum = 0;
        int power = 5;

        for (int i = 2; i <= 354294; i++) {
            int tempSum = 0;
            int num = i;
            while (num > 0) {
                int temp = num % 10;
                tempSum = tempSum + (int) Math.pow(temp, power);
                num = num / 10;
            }
            if (i == tempSum) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
