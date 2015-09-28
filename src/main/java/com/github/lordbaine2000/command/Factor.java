package com.github.lordbaine2000.command;

import java.math.BigInteger;

public class Factor implements CommandInterface {
    public static final String NAME = "Factor";

    private static final BigInteger ZERO = new BigInteger("0");
    private static final BigInteger ONE  = new BigInteger("1");

    /**
     * Prints the factorial of a given number
     *
     * @param number Number to factor
     */
    public Factor(int number) {
        System.out.println(recurse(
                new BigInteger(String.valueOf(number))
        ));
    }

    /**
     * Recursively factors a number
     * This method is safe from integer overflows due to the use of BigInt
     *
     * @param number Number to be factored
     * @return BigInteger
     */
    private BigInteger recurse(BigInteger number) {
        return (number.equals(ZERO)) ? ONE :
                number.multiply(
                        recurse(number.subtract(ONE))
                );
    }
}
