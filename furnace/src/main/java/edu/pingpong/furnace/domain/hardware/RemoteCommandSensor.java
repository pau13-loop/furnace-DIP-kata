package edu.pingpong.furnace.domain.hardware;

import edu.pingpong.furnace.domain.interfaces.Thermometer;
import edu.pingpong.furnace.domain.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer{
    
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}
