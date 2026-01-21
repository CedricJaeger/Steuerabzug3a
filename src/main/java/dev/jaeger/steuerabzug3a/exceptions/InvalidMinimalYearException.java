package dev.jaeger.steuerabzug3a.exceptions;

/**
 * Thrown to indicate that the provided fiscal year is before 1985.
 *
 * @author Cédric Jäger
 */
public class InvalidMinimalYearException extends IllegalArgumentException {

    /**
     * Constructs an <code>InvalidMinimalYearException</code> with a generic detail message.
     */
    public InvalidMinimalYearException() {
        super("The minimal year provided is invalid!");
    }

    /**
     * Constructs an <code>InvalidMinimalYearException</code> with the specified detail message.
     *
     * @param message the detail message.
     */
    public InvalidMinimalYearException(String message) {
        super(message);
    }

    /**
     * Constructs a new <code>InvalidMinimalYearException</code> with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause the cause (which is saved for later retrieval by the {@link Throwable#getCause() Throwable.getCause()} method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public InvalidMinimalYearException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new <code>InvalidMinimalYearException</code> with the specified cause.
     *
     * @param cause the cause (which is saved for later retrieval by the {@link Throwable#getCause() Throwable.getCause()} method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public InvalidMinimalYearException(Throwable cause) {
        super(cause);
    }

}
