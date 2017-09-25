package LightSwitchInterface.Lamps;

import LightSwitchInterface.LightBulbs.LightBulb;


public class Chandelier implements Lamp{
    public static final int MAX_WATTAGE = 50;
    public static final int MAX_BULBS = 10;
    
    private LightBulb[] lightBulbs; 
    
    public Chandelier(LightBulb[] lightBulbs){
        setLightBulbs(lightBulbs);
    }
    
    public final void setLightBulbs(LightBulb[] lightBulbs){
        if(lightBulbs == null || lightBulbs.length > MAX_BULBS || lightBulbs.length < 0) 
            throw new IllegalArgumentException("Must Provide non null array of LightBulbs length between 0-" + MAX_BULBS);
        for(LightBulb bulb : lightBulbs){
            if(bulb.getWattage() > MAX_WATTAGE)
                throw new IllegalArgumentException("All Light Bulbs Must Be " + MAX_WATTAGE + " or Below");
        }
        this.lightBulbs = lightBulbs;
    }
    
    public final LightBulb[] getLightBulbs(){return lightBulbs;}
    
    public final int getTotalLumanoctyProvided(){
        int totalLumans =0;
        for(LightBulb bulb: lightBulbs){
            totalLumans += bulb.getLumanocity();
        }
        return totalLumans;
    }
    
    public final int getTotalWattageConsumption(){
        int totalWattage = 0;
        for(LightBulb bulb : lightBulbs){
            totalWattage += bulb.getWattage();
        }
        return totalWattage;
    }
    
    @Override
    public final void turnOn() {
        for(LightBulb bulb : lightBulbs) bulb.turnOn();
    }

    @Override
    public final void turnOff() {
        for(LightBulb bulb : lightBulbs) bulb.turnOff();
    }

    @Override
    public final boolean isOn() {
        boolean isProvidingLight = false;
        for(LightBulb bulb : lightBulbs){
            if(bulb.isOn() && !bulb.isBurnedOut()){
                isProvidingLight = true; break;
            }
        }
        return isProvidingLight;
    }
    
}
