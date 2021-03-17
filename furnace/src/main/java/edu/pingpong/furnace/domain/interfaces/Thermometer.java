package edu.pingpong.furnace.domain.interfaces;

import edu.pingpong.furnace.domain.types.RoomTemperature;

public interface Thermometer {
    
    public double read(RoomTemperature temperature);
}
