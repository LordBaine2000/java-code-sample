package com.github.lordbaine2000;

import com.github.lordbaine2000.command.CommandFactory;

public class Main {
    /**
     * Executes an example code command
     *
     * @param args Name of command to run
     */
    public static void main(String[] args) {
        CommandFactory.getCommand(
                args.length > 0 ? args[0] : null
        );
    }
}
