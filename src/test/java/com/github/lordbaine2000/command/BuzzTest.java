package com.github.lordbaine2000.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuzzTest extends AbstractCommandTest {
    @Test
    public void testBuzz() {
        new Buzz(9);

        assertEquals(
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "Buzz\n" +
                "10\n" +
                "Buzz\n" +
                "12\n" +
                "13\n" +
                "14\n" +
                "15\n" +
                "16\n" +
                "17\n" +
                "Buzz\n" +
                "Buzz\n" +
                "20\n" +
                "21\n" +
                "Buzz\n" +
                "23\n" +
                "24\n" +
                "25\n" +
                "26\n" +
                "Buzz\n" +
                "28\n" +
                "Buzz\n" +
                "30\n" +
                "31\n" +
                "32\n" +
                "Buzz\n" +
                "34\n" +
                "35\n" +
                "Buzz\n" +
                "37\n" +
                "38\n" +
                "Buzz\n" +
                "40\n" +
                "41\n" +
                "42\n" +
                "43\n" +
                "Buzz\n" +
                "Buzz\n" +
                "46\n" +
                "47\n" +
                "48\n" +
                "Buzz\n" +
                "50\n" +
                "51\n" +
                "52\n" +
                "53\n" +
                "Buzz\n" +
                "Buzz\n" +
                "56\n" +
                "57\n" +
                "58\n" +
                "Buzz\n" +
                "60\n" +
                "61\n" +
                "62\n" +
                "Buzz\n" +
                "64\n" +
                "65\n" +
                "Buzz\n" +
                "67\n" +
                "68\n" +
                "Buzz\n" +
                "70\n" +
                "71\n" +
                "Buzz\n" +
                "73\n" +
                "74\n" +
                "75\n" +
                "76\n" +
                "Buzz\n" +
                "78\n" +
                "Buzz\n" +
                "80\n" +
                "Buzz\n" +
                "82\n" +
                "83\n" +
                "84\n" +
                "85\n" +
                "86\n" +
                "87\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "100\n",
                getOutContent()
        );
    }
}
