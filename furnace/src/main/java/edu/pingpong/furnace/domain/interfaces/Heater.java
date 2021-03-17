package edu.pingpong.furnace.domain.interfaces;

import edu.pingpong.furnace.domain.types.RoomTemperature;

public interface Heater {
    
    public void engage(RoomTemperature temperature);

    public void disengage(RoomTemperature temperature);
}
