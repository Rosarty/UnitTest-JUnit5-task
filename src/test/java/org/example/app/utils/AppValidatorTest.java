package org.example.app.utils;

import org.example.app.exceptions.TempException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AppValidatorTest {

    AppValidator validator;

    @BeforeEach
    void setUp() {
        validator = new AppValidator();
    }

    @Test
    @DisplayName("Test if temperature is in bounds.")
    void test_If_Temperature_Is_In_Bounds() throws TempException {
        assertEquals("Temperature is OK. Data can be obtained.",
                validator.validateTemperature(-11));
    }

    @Test
    @DisplayName("Test if invalid temperature throws exception.")
    void test_If_Invalid_Temperature_Throws_Exception() {
        assertThrows(TempException.class, () ->
                validator.validateTemperature(30), "No exception.");
    }

    @AfterEach
    void tearDown() {
        validator = null;
    }
}