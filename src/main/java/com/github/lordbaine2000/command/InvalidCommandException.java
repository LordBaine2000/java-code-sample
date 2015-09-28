package com.github.lordbaine2000.command;

import java.util.Arrays;

public class InvalidCommandException extends IllegalArgumentException {
    public InvalidCommandException() {
        super("Please enter one of the following commands: "+
                Arrays.asList(CommandFactory.AVAILABLE_COMMANDS).toString());
    }
}
