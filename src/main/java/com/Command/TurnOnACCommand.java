package com.Command;

import com.AirConditioner.AirConditioner;

public class TurnOnACCommand implements Command {

    public AirConditioner airConditioner;

    public TurnOnACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.setACOn(true);
        airConditioner.printStatus();
    }

    @Override
    public void undo() {
        System.out.println("We are undoing the command");
        this.airConditioner.setACOn(false);
        airConditioner.printStatus();
    }
}
