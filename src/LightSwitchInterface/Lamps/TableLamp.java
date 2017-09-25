package LightSwitchInterface.Lamps;

import LightSwitchInterface.LightBulbs.LightBulb;

public class TableLamp implements Lamp{
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

    @Override
    public final int getTotalLumanoctyProvided(){
        return lightBulb.getLumanocity();
    }
    
    @Override
    public final int getTotalWattageConsumption(){
       return lightBulb.getWattage();
    }
    
    @Override
    public final void turnOn() {lightBulb.turnOn();}

    @Override
    public final void turnOff() {lightBulb.turnOff();}

    @Override
    public final boolean isOn() {return lightBulb.isOn();}
        
}
