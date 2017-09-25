package LightSwitchInterface;

/*
    LED's have worst wattage but "Theroeticly" never die. 

*/
public class LEDBulb implements ToggleableObject, LightBulb{
    public static final int MIN_WATTAGE = 12;
    public static final int MAX_WATTAGE = 20;
    private int wattage;
    private boolean isOn;
    
    public LEDBulb(int wattage){
        setWattage(wattage);
    }
    
    @Override
    public final void setWattage(int wattage){
        if(wattage < MIN_WATTAGE || wattage > MAX_WATTAGE) throw new IllegalArgumentException("Wattage must be " + MIN_WATTAGE + "-" + MAX_WATTAGE);
        this.wattage = wattage;
    }
    
    @Override
    public final int getWattage(){ return wattage;} 

    @Override
    public void turnOn() {isOn = true;}

    @Override
    public void turnOff() {isOn = false;}
     
    @Override
    public boolean isOn() {return isOn;}

    @Override
    public boolean isBurnedOut() {return false;}

}
