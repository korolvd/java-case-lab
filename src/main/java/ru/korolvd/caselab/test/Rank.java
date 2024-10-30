package ru.korolvd.caselab.test;

import java.util.*;

public class Rank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> userCoords = List.of(scanner.nextInt(), scanner.nextInt());

        int requiredCount = scanner.nextInt();
        int count = scanner.nextInt();

        Map<List<Integer>, Integer> cafes = new HashMap<>();
        for (int i = 0; i < count; i++) {
            cafes.put(List.of(scanner.nextInt(), scanner.nextInt()), scanner.nextInt());
        }

        List<List<Integer>> requiredCafes = cafes.entrySet().stream()
                .filter(e -> e.getValue() >= 4)
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparingDouble(
                        cafeCoords -> Math.sqrt(
                                Math.pow(cafeCoords.get(0) - userCoords.get(0), 2) + Math.pow(cafeCoords.get(1) - userCoords.get(1), 2)
                        ))
                )
                .limit(requiredCount)
                .toList();

        if (requiredCafes.size() > 0) {
            requiredCafes.forEach(coords -> System.out.println("(" + coords.get(0) + "," + coords.get(1) + ")"));
        } else {
            System.out.println("Нет кафе с подходящим рейтингом");
        }

    }
}
