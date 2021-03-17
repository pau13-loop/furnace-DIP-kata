package edu.pingpong.furnace.main;

import edu.pingpong.furnace.domain.types.RoomTemperature;
import edu.pingpong.furnace.domain.hardware.GasHeater;
import edu.pingpong.furnace.domain.hardware.RemoteCommandSensor;
import edu.pingpong.furnace.domain.hardware.RegulatorController;
import edu.pingpong.furnace.domain.interfaces.*;
import edu.pingpong.furnace.domain.otherStuff.Jedi;

public class FurnaceApp 
{
    public static void main( String[] args )
    {
    	final double minTemp = 13.0;
        final double maxTemp = 28.0;
        
        RoomTemperature temperature = new RoomTemperature(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new RegulatorController();
        
        System.out.println( "\nArrancando...\n" );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: \n" );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
    }
}