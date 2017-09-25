package LightSwitchInterface;
public class FlorecentBulb {
    private boolean isOn;
    private Wattage wattage;
    
    public FlorecentBulb(Wattage wattage){
        setWattage(wattage);
    }
    
    public void setWattage(Wattage wattage){
        if(wattage == null) throw new IllegalArgumentException("Wattage May Not Be Null");
        this.wattage = wattage;
    }
    
    public void turnOn(){isOn = true;}
    public void turnOff(){isOn = false;}
    public boolean isOn(){return isOn;}
}
