package org.example;

import org.example.Pair;

import java.util.Arrays;

public class Main {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 2, 4};

        System.out.println(compareArrays(array1, array2)); // true
        System.out.println(compareArrays(array1, array3)); // false

        Pair<String, Integer> pair1 = new Pair<>("Hello", 1);
        Pair<Integer, String> pair2 = new Pair<>(2, "World");

        System.out.println(pair1.getFirst()); // "Hello"
        System.out.println(pair1.getSecond()); // 1
        System.out.println(pair2.getFirst()); // 2
        System.out.println(pair2.getSecond()); // "World"
        System.out.println(pair1); // "Hello, 1"
        System.out.println(pair2); // "2, World"
    }
}

