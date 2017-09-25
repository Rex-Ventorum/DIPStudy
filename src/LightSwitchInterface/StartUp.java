package LightSwitchInterface;
import LightSwitchInterface.Lamps.*;
import LightSwitchInterface.LightBulbs.*;

public class StartUp {
    public static void main(String[] args) {
        LightBulb bulb1 = new IncandescentBulb(100,1600);
        Lamp lamp1 = new TableLamp(bulb1);
        
        LightSwitch lightSwitch = new LightSwitch(lamp1);
        LampReportService reportService = new LampReportService(lamp1);
        reportService.printTotalWattageConsumption();
        
        lightSwitch.flipSwitchOn();
        reportService.printTotalLumanocity();
        lightSwitch.flipSwithcOff();
        reportService.printTotalLumanocity();
        
        System.out.println("");
        System.out.println("");
        
        LightBulb[] bulbs = new LightBulb[10];
        for(int b=0; b<bulbs.length; b++){
            bulbs[b] = new LEDBulb(20,102);
        }
        bulbs[0] = new HalogenBulb(50,500);
        bulbs[9] = new HalogenBulb(50,500); 
        
        Lamp lamp2 = new Chandelier(bulbs);
        
        lightSwitch = new LightSwitch(lamp2);
        reportService = new LampReportService(lamp2);
        reportService.printTotalWattageConsumption();
        
        lightSwitch.flipSwitchOn();
        reportService.printTotalLumanocity();
        lightSwitch.flipSwithcOff();
        reportService.printTotalLumanocity();
        
    }
}
