package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(int temperatureCelsius){
        int temperatureFahrenheit = (9/5) * temperatureCelsius + 32;
        System.out.println(temperatureFahrenheit);
    }
    public static void main(String[] args){
        toFahrenheit(10);
    }
}
