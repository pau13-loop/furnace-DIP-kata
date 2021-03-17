package edu.pingpong.furnace.domain.hardware;

import edu.pingpong.furnace.domain.interfaces.Heater;
import edu.pingpong.furnace.domain.types.RoomTemperature;

public class GasHeater implements Heater{

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(1);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.incrementTemperature(-1);
    }
}