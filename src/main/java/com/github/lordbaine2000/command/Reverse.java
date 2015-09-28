package com.github.lordbaine2000.command;

public class Reverse implements CommandInterface {
    public static final String NAME = "Reverse";

    /**
     * Prints the reverse of a String
     *
     * @param string String to be reversed
     */
    public Reverse(String string) {
        System.out.println(recurse(string));
    }

    /**
     * Recursively reverses a String
     *
     * @param string String to be recursively reversed
     * @return String
     */
    private String recurse(String string) {
        int length = string.length();

        return (length == 0) ? string :
                string.charAt(length-1) + recurse(string.substring(0, length-1));
    }
}
