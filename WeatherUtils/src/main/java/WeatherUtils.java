/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renata
 */    
 public class WeatherUtils {

    public static final double DANGEROUS_WINDSPEED = 70.0;
    public static final double DANGEROUS_RAINFALL = 6.0;
    public static final double CONCERNING_WINDSPEED = 45.0;
    public static final double CONCERNING_RAINFALL = 4.0;

    public static String weatherUtils(double windSpeed, double precipitation) {
        if (windSpeed < 0 || precipitation < 0) {
            throw new IllegalArgumentException("Viteza vantului si precipitatiile nu trenuie sa fie negative");
        }

        if (precipitation > DANGEROUS_RAINFALL || windSpeed > DANGEROUS_WINDSPEED
                || (precipitation > CONCERNING_RAINFALL && windSpeed > CONCERNING_WINDSPEED)) {
            return "CANCEL";
        } else if (windSpeed > CONCERNING_WINDSPEED || precipitation > CONCERNING_RAINFALL) {
            return "WARN";
        } else {
            return "ALL CLEAR";
        }
        
    }

    public static void main(String[] args) {
        double windSpeed = 50.0;
        double precipitation = 5.0;
        System.out.println("Weather: " + weatherUtils(windSpeed, precipitation));
    }
}

