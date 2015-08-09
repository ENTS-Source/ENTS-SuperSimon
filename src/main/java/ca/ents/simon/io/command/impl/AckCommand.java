package ca.ents.simon.io.command.impl;

import ca.ents.simon.io.command.Command;
import ca.ents.simon.io.command.SimonCommand;
import ca.ents.simon.io.command.init.impl.AckCommandInitializer;

/**
 * Used by clients to acknowledge a command being sent to them
 */
@Command(commandId = 0x00, initializer = AckCommandInitializer.class)
public class AckCommand extends SimonCommand {

    public AckCommand() {
        super();
    }

    public AckCommand(byte receivedForAddress) {
        super(receivedForAddress);
    }
}
