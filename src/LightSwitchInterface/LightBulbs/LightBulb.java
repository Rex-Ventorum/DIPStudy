package LightSwitchInterface.LightBulbs;

import LightSwitchInterface.ToggleableObject;

public interface LightBulb extends ToggleableObject{
    public static final int MAX_LUMANS = 1600;
    public abstract int getWattage();
    public abstract void setWattage(int wattage);
    public abstract int getLumanocity();
    public abstract void setLumanocity(int lumans);
    public abstract boolean isBurnedOut();
}
