package com.AirConditioner;

public class AirConditioner {

    private int temperature;
    private boolean isACOn;


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        printStatus();
    }

    public void setACOn(boolean ACOn) {
        isACOn = ACOn;
    }

    public void printStatus(){
        if(this.isACOn)
            System.out.println("Yay!! AC is turned On, Temperature: "+this.temperature);
        else
            System.out.println("We have switched off the AC "+this.temperature);
    }
}
