
package LightSwitchInterface;
/**
 * Any Object that simply has an on/off interface
 * @author Brandon
 */
public interface ToggleableObject {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract boolean isOn();
}
