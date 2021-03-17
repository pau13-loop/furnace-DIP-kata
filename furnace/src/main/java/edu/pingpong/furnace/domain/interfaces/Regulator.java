package edu.pingpong.furnace.domain.interfaces;

import edu.pingpong.furnace.domain.types.RoomTemperature;

public interface Regulator {
    
    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature);
}
