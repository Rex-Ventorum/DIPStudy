package LightSwitchInterface;

public interface LightBulb extends ToggleableObject{
    public abstract int getWattage();
    public abstract void setWattage(int wattage);
    public abstract boolean isBurnedOut();
}
