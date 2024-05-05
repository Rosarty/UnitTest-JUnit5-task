package org.example.app.utils;

import org.example.app.exceptions.TempException;

public class AppValidator {

    private static final int TEMPERATURE_LOWER_LIMIT = -10;
    private static final int TEMPERATURE_UPPER_LIMIT = 35;

    public String validateTemperature(int temp)
            throws TempException {
        if (temp >= TEMPERATURE_LOWER_LIMIT
                & temp <= TEMPERATURE_UPPER_LIMIT) {
            return "Temperature is OK. Data can be obtained.";
        } else {
            throw new TempException("Invalid temperature.");
        }
    }
}
