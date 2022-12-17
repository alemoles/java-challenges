package com.devstromo.JC_56;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

import java.util.Arrays;

public class BinarySearchChallenge {

    static String[] marvel = { "Spiderman", "Venom", "Carnage", "Mysterio" };

    public static void main(String[] args) {
        sort(marvel);
        System.out.println(Arrays.stream(marvel)
            .toList());
        System.out.println(binarySearch(marvel, "Xavier"));
        System.out.println(marvel[binarySearch(marvel, "Carnage")]);
        System.out.println(binarySearch(marvel, "Lizard"));
        System.out.println(binarySearch(marvel, "Apocalypse"));
        System.out.println(binarySearch(marvel, "Spiderman"));
    }
}
