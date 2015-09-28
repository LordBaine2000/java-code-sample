package com.github.lordbaine2000.command;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public abstract class AbstractCommandTest {
    protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    protected final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setupStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanupStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    /**
     * Standardizes console output across systems
     *
     * @return String
     */
    protected String getOutContent() {
        return outContent.toString().replaceAll("\r\n", "\n");
    }
}
