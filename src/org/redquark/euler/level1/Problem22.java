/*
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value
 * by its alphabetical position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
 * is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */


package org.redquark.euler.level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Problem22 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        try {

            FileReader fileReader = new FileReader("src\\org\\redquark\\euler\\problemdata\\Problem22.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] data = line.split(",");

                for (String name : data) {

                    String exactName = name.substring(1, name.length() - 1);

                    names.add(exactName);
                }
            }

            bufferedReader.close();

            fileReader.close();

            Collections.sort(names);

            long sum = 0L;

            Map<Character, Integer> alphabets = new HashMap<>();

            alphabets.put('A', 1);
            alphabets.put('B', 2);
            alphabets.put('C', 3);
            alphabets.put('D', 4);
            alphabets.put('E', 5);
            alphabets.put('F', 6);
            alphabets.put('G', 7);
            alphabets.put('H', 8);
            alphabets.put('I', 9);
            alphabets.put('J', 10);
            alphabets.put('K', 11);
            alphabets.put('L', 12);
            alphabets.put('M', 13);
            alphabets.put('N', 14);
            alphabets.put('O', 15);
            alphabets.put('P', 16);
            alphabets.put('Q', 17);
            alphabets.put('R', 18);
            alphabets.put('S', 19);
            alphabets.put('T', 20);
            alphabets.put('U', 21);
            alphabets.put('V', 22);
            alphabets.put('W', 23);
            alphabets.put('X', 24);
            alphabets.put('Y', 25);
            alphabets.put('Z', 26);

            for (int i = 0; i < names.size(); i++) {

                String name = names.get(i);

                int value = 0;

                for (int j = 0; j < name.length(); j++) {

                    value = value + alphabets.get(name.charAt(j));
                }

                sum = sum + (i + 1) * value;
            }

            System.out.println(sum);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
