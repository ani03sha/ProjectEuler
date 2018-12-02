package org.redquark.euler.level3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Problem67 {

    public static void main(String[] args) {

        try {
            int[][] data = Files.lines(Paths.get("src\\org\\redquark\\euler\\problemdata\\Problem67.txt"))
                    .map(s -> Arrays.stream(s.trim().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .toArray(int[][]::new);

            for (int i = data.length - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    if (data[i + 1][j] > data[i + 1][j + 1]) {
                        data[i][j] = data[i][j] + data[i + 1][j];
                    } else {
                        data[i][j] = data[i][j] + data[i + 1][j + 1];
                    }
                }
            }
            System.out.println(data[0][0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
