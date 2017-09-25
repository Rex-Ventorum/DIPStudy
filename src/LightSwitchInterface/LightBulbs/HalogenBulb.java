package LightSwitchInterface.LightBulbs;

/**
 * Halogen Bulbs have better lifespans than Incandescent but provide less wattage
 * 
*/
public class HalogenBulb implements LightBulb{
    public static final int MIN_WATTAGE = 28;
    public static final int MAX_WATTAGE = 72;
    private int wattage;
    private int lumans;
    private boolean isOn;
    private int lifeSpan;
    
    public HalogenBulb(int wattage, int lumans){
        setWattage(wattage);
        setLumanocity(lumans);
        lifeSpan = 200;
    }
    
    @Override
    public final void setWattage(int wattage){
        if(wattage < MIN_WATTAGE || wattage > MAX_WATTAGE) throw new IllegalArgumentException("Wattage must be " + MIN_WATTAGE + "-" + MAX_WATTAGE);
        this.wattage = wattage;
    }
    
    @Override
    public final int getWattage(){ return wattage;} 

    @Override
    public final void turnOn() {isOn = true; lifeSpan--; }

    @Override
    public final void turnOff() {isOn = false;}

    @Override
    public final boolean isOn() {return isOn;}

    @Override
    public final boolean isBurnedOut() {return lifeSpan <= 0;}
    
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
