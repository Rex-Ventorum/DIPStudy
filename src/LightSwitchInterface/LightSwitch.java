package LightSwitchInterface;

public class LightSwitch {
    private ToggleableObject toggleable;
    
    public LightSwitch(ToggleableObject toggleable){
        setToggleable(toggleable);
    }
    
    public final void setToggleable(ToggleableObject toggleable){
        if(toggleable == null) throw new IllegalArgumentException("ToggleableObject must be non null");
        this.toggleable = toggleable;
    }
    
   
}
