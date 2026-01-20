package link.jaeger.steuerabzug3a;

import link.jaeger.steuerabzug3a.exceptions.InvalidMinimalYearException;
import link.jaeger.steuerabzug3a.exceptions.UnsupportedMaximalYearException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SteuerAbzug3aTest {

    @Test
    void testWithAnAffiliationToSecondPillarWhenYearIsBeforeMinimalYearThrowsAnException() {
        int oneYearBeforeMinimalYear = Steuerabzug3a.MIN_SUPPORTED_YEAR - 1;
        Exception exception = assertThrows(InvalidMinimalYearException.class, () -> Steuerabzug3a.mitZweiteSaeule(oneYearBeforeMinimalYear));
        String expectedMessage = "The year provided is invalid! Year provided = '" + oneYearBeforeMinimalYear + "'!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testWithoutAnAffiliationToSecondPillarWhenYearIsBeforeMinimalYearThrowsAnException() {
        int oneYearBeforeMinimalYear = Steuerabzug3a.MIN_SUPPORTED_YEAR - 1;
        Exception exception = assertThrows(InvalidMinimalYearException.class, () -> Steuerabzug3a.ohneZweiteSaeule(oneYearBeforeMinimalYear));
        String expectedMessage = "The year provided is invalid! Year provided = '" + oneYearBeforeMinimalYear + "'!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testWithAnAffiliationToSecondPillarWhenYearIsAfterMaximalYearThrowsAnException() {
        int oneYearAfterMaximalYear = Steuerabzug3a.MAX_SUPPORTED_YEAR + 1;
        Exception exception = assertThrows(UnsupportedMaximalYearException.class, () -> Steuerabzug3a.mitZweiteSaeule(oneYearAfterMaximalYear));
        String expectedMessage = "The year provided is not yet supported! Year provided = '" + oneYearAfterMaximalYear + "'!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testWithoutAnAffiliationToSecondPillarWhenYearIsAfterMaximalYearThrowsAnException() {
        int oneYearAfterMaximalYear = Steuerabzug3a.MAX_SUPPORTED_YEAR + 1;
        Exception exception = assertThrows(UnsupportedMaximalYearException.class, () -> Steuerabzug3a.ohneZweiteSaeule(oneYearAfterMaximalYear));
        String expectedMessage = "The year provided is not yet supported! Year provided = '" + oneYearAfterMaximalYear + "'!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testWithAnAffiliationToSecondPillarMustReturnTheCorrectValue() {
         int expectedAmountInFiscalYear2025 = 7258;
         int actualAmountInFiscalYear2025 = Steuerabzug3a.mitZweiteSaeule(2025);

         assertEquals(expectedAmountInFiscalYear2025, actualAmountInFiscalYear2025);
    }

    @Test
    void testWithoutAnAffiliationToSecondPillarMustReturnTheCorrectValue() {
        int expectedAmountInFiscalYear2025 = 36288;
        int actualAmountInFiscalYear2025 = Steuerabzug3a.ohneZweiteSaeule(2025);

        assertEquals(expectedAmountInFiscalYear2025, actualAmountInFiscalYear2025);
    }

}
