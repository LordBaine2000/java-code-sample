package com.github.lordbaine2000.command;

public class CommandFactory {
    public static final String[] AVAILABLE_COMMANDS = {
            Buzz.NAME, Intersect.NAME, Reverse.NAME, Factor.NAME
    };

    /**
     * Returns a command object based on it's NAME
     *
     * @param name Name of command to run
     * @return CommandInterface
     * @throws InvalidCommandException if name is null or does not exist
     */
    public static CommandInterface getCommand(String name) throws InvalidCommandException {
        if(name == null) {
            throw new InvalidCommandException();
        }

        switch(name) {
            case Buzz.NAME:
                return new Buzz(7);
            case Intersect.NAME:
                return new Intersect(new Integer[] {1,3,5,7,9}, new Integer[] {1,2,3,4,5});
            case Reverse.NAME:
                return new Reverse("Jacky is a dog");
            case Factor.NAME:
                return new Factor(34);
            default:
                throw new InvalidCommandException();
        }
    }
}
