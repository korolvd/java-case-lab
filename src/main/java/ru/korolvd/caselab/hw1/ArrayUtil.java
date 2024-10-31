package ru.korolvd.caselab.hw1;

import java.util.Arrays;

public class ArrayUtil {

    public static double[] generate(int size, double min, double max) {
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * (max - min);
        }
        return array;
    }

    public static int[] generate(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min)) + min;
        }
        return array;
    }

    public static double min(double[] array) {
        double min = Double.MAX_VALUE;
        for (double d : array) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static double max(double[] array) {
        double max = Double.MIN_VALUE;
        for (double d : array) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int avg(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static double avg(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static void sort(double[] array) {
        Arrays.sort(array);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sortDesc(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
