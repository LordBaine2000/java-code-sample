package com.github.lordbaine2000.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorTest extends AbstractCommandTest {
    @Test
    public void testFactor() {
        new Factor(29);

        assertEquals("8841761993739701954543616000000\n", getOutContent());
    }
}
