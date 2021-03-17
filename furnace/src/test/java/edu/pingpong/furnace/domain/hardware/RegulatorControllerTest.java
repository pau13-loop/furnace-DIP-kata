package edu.pingpong.furnace.domain.hardware;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.furnace.domain.interfaces.Heater;
import edu.pingpong.furnace.domain.interfaces.Thermometer;
import edu.pingpong.furnace.domain.types.RoomTemperature;

public class RegulatorControllerTest {

    private RegulatorController regulator;
    private Thermometer thermometer;
    private Heater heater;
    private RoomTemperature temperature;
    private double minTemp = 13.0;
    private double maxTemp = 28.0;
    private double DELTA = 0.01; 

    @Before
    public void setupRegulatorController() {
        regulator = new RegulatorController();
        thermometer = new RemoteCommandSensor();
        heater = new GasHeater();
        temperature = new RoomTemperature(0);
    }
    
    @Test
    public void regulateTempTest() {
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        assertEquals(13, temperature.getTemperature(), DELTA);
    }
}
