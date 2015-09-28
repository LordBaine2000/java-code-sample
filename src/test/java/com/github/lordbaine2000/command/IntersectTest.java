package com.github.lordbaine2000.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectTest extends AbstractCommandTest {
    @Test
    public void testIntersect() {
        new Intersect(new String[] {"Apple", "Orange", "Pear"}, new String[] {"Kumquat", "Apple", "Rutabaga"});

        assertEquals("[Apple]\n", getOutContent());
    }
}
