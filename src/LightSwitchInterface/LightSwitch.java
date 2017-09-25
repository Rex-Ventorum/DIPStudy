package LightSwitchInterface;

import LightSwitchInterface.Lamps.Lamp;

public class LightSwitch {
    private Lamp lamp;
    
    public LightSwitch(Lamp lamp){
        setLamp(lamp);
    }
    
    public final void setLamp(Lamp lamp){
        if(lamp == null) throw new IllegalArgumentException("Lamp must be non null");
        this.lamp = lamp;
    }
    
    public void flipSwitchOn(){
        lamp.turnOn();
    }
    
    public void flipSwithcOff(){
        lamp.turnOff();
    }
    
   
}
