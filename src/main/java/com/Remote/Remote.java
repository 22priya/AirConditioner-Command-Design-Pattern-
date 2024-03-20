package com.Remote;

import com.Command.Command;

import java.util.Stack;

public class Remote {
    public Command command;
    Stack<Command> commandStack=new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        this.command.execute();
        commandStack.add(command);
    }

    public void undo(){
        Command cmd= commandStack.pop();
        cmd.undo();
    }
}
