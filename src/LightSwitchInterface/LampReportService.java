package LightSwitchInterface;

import LightSwitchInterface.Lamps.Lamp;

public class LampReportService {
    private Lamp lamp;
    
    public LampReportService(Lamp lamp){
        setLamp(lamp);
    }
    
    public final void setLamp(Lamp lamp){
        if(lamp == null) throw new IllegalArgumentException("Lamp must be non null");
        this.lamp = lamp;
    }
       
    public final Lamp getLamp(){
        return lamp;
    }
    
    public  final void printTotalLumanocity(){
        System.out.println("This Lamp Is Providing " + lamp.getTotalLumanoctyProvided() + " lumans of light!");
    }
    
    public final void printTotalWattageConsumption(){
        System.out.println("This Lamp Consumes " + lamp.getTotalWattageConsumption() + " watts when turned on!");
    }
}
