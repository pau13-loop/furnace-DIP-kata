package edu.pingpong.furnace.domain.otherStuff;

import java.time.temporal.TemporalQueries;

import edu.pingpong.furnace.domain.hardware.GasHeater;
import edu.pingpong.furnace.domain.interfaces.Heater;
import edu.pingpong.furnace.domain.types.RoomTemperature;

public class Jedi implements Heater{
    
    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(toucheLightSable());        
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        Heater heater = new GasHeater();
        forcePersuasion(heater, temperature);
    }

    private double toucheLightSable() {
        final double lightSableTemp = 1400;
        return lightSableTemp;
    }

    private void forcePersuasion(Heater heater, RoomTemperature temperature) {
        temperature.incrementTemperature(-1400);
        heater.disengage(temperature);
    }

    public void speak(){
        System.out.println("\n"
                + "\t  __.-._   \n"
                + "\t  '-._\"7' \n"
                + "\t   /'.-c   \n"
                + "\t   |  /T   \n"
                + "\t  _)_/LI   \n"
                + "\nDo or do not. There is no try ");
        }
}
