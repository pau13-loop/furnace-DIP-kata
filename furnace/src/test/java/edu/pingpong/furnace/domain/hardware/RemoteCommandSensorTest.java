package edu.pingpong.furnace.domain.hardware;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.furnace.domain.types.RoomTemperature;

public class RemoteCommandSensorTest {

    private RemoteCommandSensor sensor;
    private RoomTemperature temperature;
    private double DELTA = 0.01;

    @Before
    public void setupGasHeater() {
        sensor = new RemoteCommandSensor();
        temperature = new RoomTemperature(0);
    }

    @Test
    public void readTest() {
        temperature.setTemperature(10);
        assertEquals(10, sensor.read(temperature), DELTA);
    }
}
