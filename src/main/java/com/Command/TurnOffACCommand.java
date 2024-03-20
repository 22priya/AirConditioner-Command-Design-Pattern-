package com.Command;

import com.AirConditioner.AirConditioner;

public class TurnOffACCommand implements Command{
    public AirConditioner airConditioner;

    public TurnOffACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.setACOn(false);
        airConditioner.printStatus();
    }

    @Override
    public void undo() {
        System.out.println("We are undoing the command");
        this.airConditioner.setACOn(true);
        airConditioner.printStatus();
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
}
