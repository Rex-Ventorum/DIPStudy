package LightSwitchInterface.LightBulbs;

import LightSwitchInterface.ToggleableObject;

public interface LightBulb extends ToggleableObject{
    public abstract int getWattage();
    public abstract void setWattage(int wattage);
    public abstract boolean isBurnedOut();
}
