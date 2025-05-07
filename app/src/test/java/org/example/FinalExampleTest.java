package org.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FinalExampleTest {

    private static final String EMAIL = "prueba@example.com";
    private static final String PHONE = "12345678";
    private static final String ADDRESS = "direccion falsa 123";
    private static final String CITY = "xela";
    private static final String ZIP = "1234";

    private FinalExample finalExample;

    @BeforeEach
    void setUp() {
        finalExample = new FinalExample();
    }

    @Test
    void canProcessData() {
        // given
        String input = "word, palabra,  dos palabras, 1234, otro, test   , , nada";

        // when & then
        assertDoesNotThrow(() -> finalExample.processData(input));
    }

    @Test
    void canCreateUser() {
        // given
        String name = "Persona";
        String expectedRespose = "User created: " + name;

        // when
        String actualResponse = finalExample.createUser(name, EMAIL, PHONE, ADDRESS, CITY, ZIP);

        // then
        assertEquals(expectedRespose, actualResponse);
    }

    @Test
    void cannotCreateUser_WithNullName() {
        // given
        String nullName = null;
        String expectedResponse = "Name cannot be empty";

        // when
        String actualResponse = finalExample.createUser(nullName, EMAIL, PHONE, ADDRESS, CITY, ZIP);

        // then
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void cannotCreateUser_WithEmptyName() {
        // given
        String emptyName = "";
        String expectedResponse = "Name cannot be empty";

        // when
        String actualResponse = finalExample.createUser(emptyName, EMAIL, PHONE, ADDRESS, CITY, ZIP);

        // then
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void cannotCreateUser_WithEmptyEmail() {
        // given
        String name = "Persona";
        String emptyEmail = null;
        String expectedResponse = "Invalid email";

        // when
        String actualResponse = finalExample.createUser(name, emptyEmail, PHONE, ADDRESS, CITY, ZIP);

        // then
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void cannotCreateUser_WithInvalidEmail() {
        // given
        String name = "Persona";
        String invalidEmail = "prueba.com";
        String expectedResponse = "Invalid email";

        // when
        String actualResponse = finalExample.createUser(name, invalidEmail, PHONE, ADDRESS, CITY, ZIP);

        // then
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void canCalculateArea_ForCircle() {
        // given
        String shape = "circle";
        double radius = 10;
        double expectedArea = Math.PI * Math.pow(radius, 2);

        // when
        double actualArea = finalExample.calculateArea(shape, radius);

        // then
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void canCalculateArea_ForRectangle() {
        // given
        String shape = "rectangle";
        double base = 10;
        double height = 20;
        double expectedArea = 200;

        // when
        double actualArea = finalExample.calculateArea(shape, base, height);

        // then
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void canCalculateArea_ForTriangle() {
        // given
        String shape = "triangle";
        double base = 10;
        double height = 20;
        double expectedArea = 100;

        // when
        double actualArea = finalExample.calculateArea(shape, base, height);

        // then
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void cannotCalculateArea_ForUnknownShape() {
        // given
        String shape = "polygon";
        double sides = 15;
        double sideSize = 200;

        // when & then
        assertThrows(IllegalArgumentException.class, () -> finalExample.calculateArea(shape, sides, sideSize));
    }
}
