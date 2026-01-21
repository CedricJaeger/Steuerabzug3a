package dev.jaeger.steuerabzug3a;

import dev.jaeger.steuerabzug3a.exceptions.InvalidMinimalYearException;
import dev.jaeger.steuerabzug3a.exceptions.UnsupportedMaximalYearException;

/**
 * Utility class to get the maximal deductible amount for a given fiscal year
 *
 * @version 2026.1.0
 * @author Cédric Jäger
 */
public final class Steuerabzug3a {

    /** The minimal fiscal year which is supported. */
    static final int MIN_SUPPORTED_YEAR = 1985;
    /** The maximal fiscal year which is supported. */
    static final int MAX_SUPPORTED_YEAR = 2026;

    private Steuerabzug3a() {}

    /**
     * Return the maximal deductible amount for a given fiscal year for a person with an affiliation to a second
     * pillar institution.
     *
     * @param jahr the fiscal year.
     * @return the maximal deductible amount in CHF.
     * @throws InvalidMinimalYearException is thrown when the year is before {@link Steuerabzug3a#MIN_SUPPORTED_YEAR}.
     * @throws UnsupportedMaximalYearException is thrown when the year is after {@link Steuerabzug3a#MAX_SUPPORTED_YEAR}.
     */
    public static int mitZweiteSaeule(int jahr) {
        if (jahr < MIN_SUPPORTED_YEAR) {
            throw new InvalidMinimalYearException("The year provided is invalid! Year provided = '" + jahr + "'!");
        } else if (jahr > MAX_SUPPORTED_YEAR) {
            throw new UnsupportedMaximalYearException("The year provided is not yet supported! Year provided = '" + jahr + "'!");
        }
        return Steuerabzug3aData.valueOf("JAHR_" + jahr).mitZweiteSaeule();
    }

    /**
     * Return the maximal deductible amount for a given fiscal year for a person without an affiliation to a second
     * pillar institution.
     *
     * @param jahr the fiscal year.
     * @return the maximal deductible amount in CHF.
     * @throws InvalidMinimalYearException is thrown when the year is before {@link Steuerabzug3a#MIN_SUPPORTED_YEAR}.
     * @throws UnsupportedMaximalYearException is thrown when the year is after {@link Steuerabzug3a#MAX_SUPPORTED_YEAR}.
     */
    public static int ohneZweiteSaeule(int jahr)
    {
        if (jahr < MIN_SUPPORTED_YEAR) {
            throw new InvalidMinimalYearException("The year provided is invalid! Year provided = '" + jahr + "'!");
        } else if (jahr > MAX_SUPPORTED_YEAR) {
            throw new UnsupportedMaximalYearException("The year provided is not yet supported! Year provided = '" + jahr + "'!");
        }
        return Steuerabzug3aData.valueOf("JAHR_" + jahr).ohneZweiteSaeule();
    }

}
