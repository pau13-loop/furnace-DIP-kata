package edu.pingpong.furnace.domain.types;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoomTemperatureTest 
{
    private RoomTemperature temperature;
    private double DELTA = 0.01;

    @Test
    public void getTemperatureTest() {
        temperature = new RoomTemperature(0);
        temperature.setTemperature(25);

        assertEquals(25, temperature.getTemperature(), DELTA);
    }

    @Test
    public void incrementTemperatureTest() {
        temperature = new RoomTemperature(0);
        temperature.setTemperature(25);
        assertEquals(25, temperature.getTemperature(), DELTA);

        temperature.incrementTemperature(25);
        assertEquals(50, temperature.getTemperature(), DELTA);
    }
}
