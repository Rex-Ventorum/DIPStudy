package LightSwitchInterface;
public class LEDBulb extends ToggleableObject implements LightBulb{
    public static final int MIN_WATTAGE = 12;
    public static final int MAX_WATTAGE = 20;
    private int wattage;
    
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

}
