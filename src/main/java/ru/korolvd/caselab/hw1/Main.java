package ru.korolvd.caselab.hw1;

import java.util.Arrays;
import java.util.Scanner;

import static ru.korolvd.caselab.hw1.ArrayUtil.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                <type> <size> <min> <max>
                    type required i - int values
                                  d - double values
                    size required
                    min max default 0 10
                e - exit
                                
                example: i 10 1 6""";
        System.out.println(menu);

        boolean isRun = true;
        while (isRun) {
            try {
                System.out.print("\n> ");
                String[] input = sc.nextLine().split(" ");
                if (input.length < 2) {
                    throw new IllegalArgumentException("Incorrect input");
                }

                String type = input[0];
                int size = Integer.parseInt(input[1]);
                if (size == 0) {
                    throw new IllegalArgumentException("Required size > 0");
                }

                switch (type) {
                    case "i" -> {
                        int min = input.length > 2 ? Integer.parseInt(input[2]) : 0;
                        int max = input.length > 3 ? Integer.parseInt(input[3]) : 10;
                        int[] array = generate(size, min, max);
                        sort(array);
                        System.out.println(Arrays.toString(array));
                        sortDesc(array);
                        System.out.println(Arrays.toString(array));
                        System.out.println("min " + min(array) + ", avg " + avg(array) + ", max " + max(array));
                    }
                    case "d" -> {
                        double min = input.length > 2 ? Double.parseDouble(input[2]) : 0.0;
                        double max = input.length > 3 ? Double.parseDouble(input[3]) : 10.0;
                        double[] array = generate(size, min, max);
                        sort(array);
                        System.out.println(Arrays.toString(array));
                        sortDesc(array);
                        System.out.println(Arrays.toString(array));
                        System.out.println("min " + min(array) + ", avg " + avg(array) + ", max " + max(array));
                    }
                    case "e" -> isRun = false;
                    default -> throw new IllegalArgumentException("Incorrect input");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
