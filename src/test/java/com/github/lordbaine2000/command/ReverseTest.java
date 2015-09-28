package com.github.lordbaine2000.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest extends AbstractCommandTest {
    @Test
    public void testReverse() {
        new Reverse("Calling Jacky a dog isn't very nice...");

        assertEquals("...ecin yrev t'nsi god a ykcaJ gnillaC\n", getOutContent());
    }
}
