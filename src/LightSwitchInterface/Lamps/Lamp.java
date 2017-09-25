
package LightSwitchInterface.Lamps;
import LightSwitchInterface.ToggleableObject;

public interface Lamp extends ToggleableObject{

   public abstract int getTotalLumanoctyProvided();

   public abstract int getTotalWattageConsumption();
    
}
