package edu.pingpong.furnace.domain.hardware;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.furnace.domain.types.RoomTemperature;

public class GasHeaterTest {
    
    private GasHeater gasHeater;
    private RoomTemperature temperature;
    private double DELTA = 0.01;

    @Before
    public void setupGasHeater() {
        gasHeater = new GasHeater();
        temperature = new RoomTemperature(0);
    }

    @Test
    public void engageTest() {
        gasHeater.engage(temperature);
        assertEquals(1, temperature.getTemperature(), DELTA);
    }

    @Test
    public void disengageTest() {
        temperature.setTemperature(10);
        gasHeater.disengage(temperature);
        assertEquals(9, temperature.getTemperature(), DELTA);
    }
    
}
