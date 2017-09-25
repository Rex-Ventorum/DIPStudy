package LightSwitchInterface.LightBulbs;

/*
    LED's have worst wattage but "Theroeticly" never die. 

*/
public class LEDBulb implements LightBulb{
    public static final int MIN_WATTAGE = 12;
    public static final int MAX_WATTAGE = 20;
    private int wattage;
    private boolean isOn;
    private int lumans;
    
    public LEDBulb(int wattage, int lumans){
        setWattage(wattage);
        setLumanocity(lumans);
    }
    
    @Override
    public final void setWattage(int wattage){
        if(wattage < MIN_WATTAGE || wattage > MAX_WATTAGE) throw new IllegalArgumentException("Wattage must be " + MIN_WATTAGE + "-" + MAX_WATTAGE);
        this.wattage = wattage;
    }
    
    @Override
    public final int getWattage(){return wattage;} 

    @Override
    public final void turnOn() {isOn = true;}

    @Override
    public final void turnOff() {isOn = false;}
     
    @Override
    public final boolean isOn() {return isOn;}

    @Override
    public final boolean isBurnedOut() {return false;}

    @Override
    public final int getLumanocity() {
        if(isOn) return lumans;
        else return 0;
    }

    @Override
    public final void setLumanocity(int lumans) {
      if(lumans < 0 || lumans > LightBulb.MAX_LUMANS) throw new IllegalArgumentException("Lumans Must Be between 0-" + LightBulb.MAX_LUMANS);
      this.lumans = lumans;
    }

}
