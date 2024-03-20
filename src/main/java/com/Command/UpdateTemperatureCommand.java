package com.Command;

import com.AirConditioner.AirConditioner;

public class UpdateTemperatureCommand implements Command{

    public AirConditioner airConditioner;

    public int newTemperature;
    public int oldTemperature;

    public UpdateTemperatureCommand(AirConditioner airConditioner,int temperature) {
        this.airConditioner = airConditioner;
        this.newTemperature=temperature;
    }
    @Override
    public void execute() {
        this.oldTemperature=airConditioner.getTemperature();
        this.airConditioner.setTemperature(this.newTemperature);
    }

    @Override
    public void undo() {
        System.out.println("We are undoing the command");
        this.airConditioner.setTemperature(oldTemperature);
    }
}
