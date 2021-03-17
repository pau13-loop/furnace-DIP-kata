package edu.pingpong.furnace.domain.hardware;

import edu.pingpong.furnace.domain.interfaces.Heater;
import edu.pingpong.furnace.domain.interfaces.Regulator;
import edu.pingpong.furnace.domain.interfaces.Thermometer;
import edu.pingpong.furnace.domain.types.RegulatorDisplayCodes;
import edu.pingpong.furnace.domain.types.RoomTemperature;

public class RegulatorController implements Regulator{
    
    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature) {
        
        while(thermometer.read(temperature) < maxTemp) {
            RegulatorDisplayCodes code = RegulatorDisplayCodes.HEATING;
            heater.engage(temperature);
            message(code, temperature);
        }

        while (thermometer.read(temperature) > minTemp) {
            RegulatorDisplayCodes code = RegulatorDisplayCodes.WAITING;
            heater.disengage(temperature);
            message(code, temperature);
        }
    }

    public void message(RegulatorDisplayCodes code, RoomTemperature temperature) {
        switch(code) {
            case HEATING:
            System.out.println("\tCalentando => temperatura " + temperature.getTemperature());
            break;

            case WAITING:
            System.out.println("\tApagando => temperatura " + temperature.getTemperature());
            break;

            default:
            System.out.println("\tAlgo no esta funcinando como debería...");
        }
    }
}
