package dev.jaeger.steuerabzug3a.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvalidMinimalYearExceptionTest {

    @Test
    public void testInvalidMinimalYearExceptionDefaultConstructorTest() {
        String expectedMessage = "The minimal year provided is invalid!";
        Exception exception = new InvalidMinimalYearException();
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testInvalidMinimalYearExceptionConstructorWithMessageParameterTest() {
        String expectedMessage = "A test message!";
        Exception exception = new InvalidMinimalYearException(expectedMessage);
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testInvalidMinimalYearExceptionConstructorWithMessageAndCauseParametersTest() {
        String expectedMessage = "A test message!";
        Throwable expectedCause = new Throwable();
        Exception exception = new InvalidMinimalYearException(expectedMessage, expectedCause);
        String actualMessage = exception.getMessage();
        Throwable actualCause = exception.getCause();
        assertEquals(expectedMessage, actualMessage);
        assertEquals(expectedCause, actualCause);
    }

    @Test
    public void testInvalidMinimalYearExceptionConstructorWithCauseParameterTest() {
        Throwable expectedCause = new Throwable();
        Exception exception = new InvalidMinimalYearException(expectedCause);
        Throwable actualCause = exception.getCause();
        assertEquals(expectedCause, actualCause);
    }

}
