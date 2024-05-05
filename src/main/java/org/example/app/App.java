package org.example.app;

import org.example.app.data.DataProvider;
import org.example.app.exceptions.TempException;
import org.example.app.utils.AppValidator;

public class App {

    public static void main(String[] args) {
        getOutput(handleData());
    }

    private static String handleData() {
        DataProvider provider = new DataProvider();
        AppValidator validator = new AppValidator();
        try {
            return validator.validateTemperature(provider.getTemperature());
        } catch (TempException ex) {
            return ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
