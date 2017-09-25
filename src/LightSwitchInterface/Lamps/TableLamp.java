package LightSwitchInterface.Lamps;

import LightSwitchInterface.LightBulbs.LightBulb;
import LightSwitchInterface.ToggleableObject;

public class TableLamp implements ToggleableObject{
    public static final int MAX_WATTAGE = 100;
    private LightBulb lightBulb;
    
    public TableLamp(LightBulb lightBulb){
        setLightBulb(lightBulb);
    }
    
    public final void setLightBulb(LightBulb lightBulb){
        if(lightBulb.getWattage() > MAX_WATTAGE) throw new IllegalArgumentException("This Bulb is too strong!");
        this.lightBulb = lightBulb;
    }
    
    public final LightBulb getLightBulb(){return lightBulb;}

    public final void turnOn() {lightBulb.turnOn();}

    @Override
    public final void turnOff() {lightBulb.turnOff();}

    @Override
    public final boolean isOn() {return lightBulb.isOn() && !lightBulb.isBurnedOut();}
        
}
