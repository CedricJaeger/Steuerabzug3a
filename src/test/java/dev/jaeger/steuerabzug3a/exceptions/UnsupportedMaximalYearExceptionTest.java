package dev.jaeger.steuerabzug3a.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnsupportedMaximalYearExceptionTest {

    @Test
    public void testUnsupportedMaximalYearExceptionDefaultConstructor() {
        String expectedMessage = "The maximal year provided is not supported yet!";
        Exception exception = new UnsupportedMaximalYearException();
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testUnsupportedMaximalYearExceptionConstructorWithMessageParameter() {
        String expectedMessage = "A test message!";
        Exception exception = new UnsupportedMaximalYearException(expectedMessage);
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testUnsupportedMaximalYearExceptionConstructorWithMessageAndCauseParameters() {
        String expectedMessage = "A test message!";
        Throwable expectedCause = new Throwable();
        Exception exception = new UnsupportedMaximalYearException(expectedMessage, expectedCause);
        String actualMessage = exception.getMessage();
        Throwable actualCause = exception.getCause();
        assertEquals(expectedMessage, actualMessage);
        assertEquals(expectedCause, actualCause);
    }

    @Test
    public void testUnsupportedMaximalYearExceptionConstructorWithCauseParameter() {
        Throwable expectedCause = new Throwable();
        Exception exception = new UnsupportedMaximalYearException(expectedCause);
        Throwable actualCause = exception.getCause();
        assertEquals(expectedCause, actualCause);
    }

}


