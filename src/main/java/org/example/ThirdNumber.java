package org.example;

import java.util.*;

public class ThirdNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            set.add(number);
        }

        if (set.size() < 3) {
            System.out.println("Недостаточно уникальных элементов");
        } else {
            List<Integer> numbers = new ArrayList<>(set);
            Collections.sort(numbers);
            System.out.println(numbers.get(2));
        }
    }
}