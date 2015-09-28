package com.github.lordbaine2000.command;

import java.util.HashSet;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Buzz implements CommandInterface {
    public static final String NAME = "Buzz";

    /**
     * Prints all of the numbers from 1 to 100 on a new line
     * Except, if a number contains buzzNum, is a multiple of buzzNum, or is a repeating number prints NAME instead
     *
     * @param buzzNum Number on which to Buzz
     */
    public Buzz(int buzzNum) {
        for(int i=1; i<=100; i++) {
            System.out.println(
                    (contains(i, buzzNum) || isDivisible(i, buzzNum) || isPalindrome(i)) ? NAME : i
            );
        }
    }

    /**
     * Determines if one int contains another
     *
     * @param haystack Number to check in
     * @param needle   Number to check for
     * @return boolean
     */
    private boolean contains(int haystack, int needle) {
        return String.valueOf(haystack).contains(String.valueOf(needle));
    }

    /**
     * Determines if one int is divisible by another
     *
     * @param dividend Dividend
     * @param divisor  Divisor
     * @return boolean
     */
    private boolean isDivisible(int dividend, int divisor) {
        return (dividend % divisor == 0);
    }

    /**
     * Determines if a number is a palindrome
     *
     * @param number Number to check
     * @return boolean
     */
    private boolean isPalindrome(int number) {
        char[] array = String.valueOf(number).toCharArray();

        HashSet<Character> hashSet = new HashSet<>(
                Arrays.asList(
                        ArrayUtils.toObject(array)
                )
        );

        return (array.length > 1 && hashSet.size() == 1);
    }
}
