package link.jaeger.steuerabzug3a.exceptions;

/**
 * Thrown to indicate that the provided fiscal year is not supported yet.
 *
 * @author Cédric Jäger
 */
public class UnsupportedMaximalYearException extends IllegalArgumentException {

    /**
     * Constructs an UnsupportedMaximalYearException with a generic detail message.
     */
    public UnsupportedMaximalYearException() {
        super("The maximal year provided is not supported yet!");
    }

    /**
     * Constructs an <code>UnsupportedMaximalYearException</code> with the specified detail message.
     *
     * @param message the detail message.
     */
    public UnsupportedMaximalYearException(String message) {
        super(message);
    }

    /**
     * Constructs a new <code>UnsupportedMaximalYearException</code> with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause the cause (which is saved for later retrieval by the {@link Throwable#getCause() Throwable.getCause()} method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public UnsupportedMaximalYearException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new <code>UnsupportedMaximalYearException</code> with the specified cause.
     *
     * @param cause the cause (which is saved for later retrieval by the {@link Throwable#getCause() Throwable.getCause()} method). (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */

    public UnsupportedMaximalYearException(Throwable cause) {
        super(cause);
    }


}
