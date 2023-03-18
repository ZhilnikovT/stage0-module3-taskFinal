package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {  
        TemperatureConverter n = new TemperatureConverter();
        n.toFahrenheit(11);
    }
    
    public void toFahrenheit(int temperatureCelsius){
        double d = (double)temperatureCelsius;
        int i = (int)(((d * 9 / 5) + 32)*10);
        double dd = (double)i/10;
        System.out.println(dd);
    }
}
