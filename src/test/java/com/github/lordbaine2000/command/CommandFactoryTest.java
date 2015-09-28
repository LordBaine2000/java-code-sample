package com.github.lordbaine2000.command;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CommandFactoryTest extends AbstractCommandTest {
    @Test
    public void testGetCommand() {
        assertThat(CommandFactory.getCommand(Buzz.NAME), instanceOf(Buzz.class));
        assertThat(CommandFactory.getCommand(Intersect.NAME), instanceOf(Intersect.class));
        assertThat(CommandFactory.getCommand(Reverse.NAME), instanceOf(Reverse.class));
        assertThat(CommandFactory.getCommand(Factor.NAME), instanceOf(Factor.class));
    }

    @Test(expected = InvalidCommandException.class)
    public void testExceptions() {
        CommandFactory.getCommand(null);
        CommandFactory.getCommand("Invalid");
    }
}
