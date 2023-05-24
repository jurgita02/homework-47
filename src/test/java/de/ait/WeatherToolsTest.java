package de.ait;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class WeatherToolsTest {
@ParameterizedTest
@CsvSource({
        "0, false, 'Calm with speed of 0 km'",
        "2, false, 'Light Air with speed of 2 km'",
        "10, false, 'Light Breeze with speed of 10 km'",
        "18, false, 'Gentle Breeze with speed of 18 km'",
        "25, false, 'Moderate Breeze with speed of 25 km'",
        "35, false, 'Fresh Breeze with speed of 35 km'",
        "2, true, 'Gusty Light Air with speed of 2 km'",
        "10, true, 'Gusty Light Breeze with speed of 10 km'",
        "18, true, 'Gusty Gentle Breeze with speed of 18 km'",
        "25, true, 'Gusty Moderate Breeze with speed of 25 km'",
        "35, true, 'Gusty Fresh Breeze with speed of 35 km'",
})


public void getWindDescription_test1(int speed, boolean isGusty, String description){
    String res = WeatherTools.getWindDescription(speed,isGusty);
    assertEquals(
            description,
           res);

}

}