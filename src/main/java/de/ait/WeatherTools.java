package de.ait;

public class WeatherTools {
    public static String getWindDescription(int speed, boolean isGusty){
String res=" ";
        if (speed <=1 )res= "Calm";
        if (speed >1 && speed<=5 ) res= "Light Air";
        if (speed>=6 && speed <=11 )  res= "Light Breeze";
        if (speed>=12 && speed <=19 )  res= "Gentle Breeze";
        if (speed>=20 && speed <=28 )  res= "Moderate Breeze";
        if (speed>=29 && speed <=38)  res= "Fresh Breeze";

        if(isGusty) res ="Gusty " + res;
        return  res+ " with speed of " + speed+ " km";
        }
    }

