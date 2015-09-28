package com.github.lordbaine2000.command;

import java.util.Arrays;
import java.util.HashSet;

public class Intersect implements CommandInterface {
    public static final String NAME = "Intersect";

    /**
     * Prints the common items between two arrays
     * Works with arrays containing any non-primitive
     *
     * @param first  An array of objects to compare
     * @param second An array of objects to compare
     */
    public Intersect(Object[] first, Object[] second) {
        HashSet<Object> set1 = new HashSet<>(Arrays.asList(first));
        HashSet<Object> set2 = new HashSet<>(Arrays.asList(second));

        set1.retainAll(set2);

        System.out.println(set1);
    }
}
