
package LightSwitchInterface;
/**
 * Any Object that simply has an on/off interface
 * @author Brandon
 */
public abstract class ToggleableObject {
    private boolean isOn;
    public final void turnOn(){isOn = true;}
    public final void turnOff(){isOn = false;}
    public final boolean isOn(){return isOn;}
}
