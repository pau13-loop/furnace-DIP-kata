package edu.pingpong.furnace.domain.otherStuff;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.furnace.domain.types.RoomTemperature;

public class JediTest {
    
    private Jedi jedi;
    private RoomTemperature temperature;
    private static final double DELTA = 0.01;

    @Before
    public void setupJedi() {

        jedi = new Jedi();
        temperature = new RoomTemperature(20);
    }

    @Test
    public void incrementAndReduceTemp() {
        jedi.engage(temperature);
        assertEquals(1420, temperature.getTemperature(), DELTA);
        jedi.disengage(temperature);
        assertEquals(19, temperature.getTemperature(), DELTA);
    }
}
