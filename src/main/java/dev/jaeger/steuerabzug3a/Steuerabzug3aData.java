package dev.jaeger.steuerabzug3a;

/**
 * Enumeration with the data of the maximal deductible amount for each fiscal year
 * with and without an affiliation to the second pillar.
 * <p>
 * The data is based on the PDF document named "
 * <a href="https://www.estv.admin.ch/estv/de/home/die-estv/steuerstatistiken-estv/allgemeine-steuerstatistiken/fiskaleinnahmen-des-bundes.html">Chronologische Entwicklung der Gesetzgebung</a>".
 *
 * @author Cédric Jäger
 * @version 2027.1.0
 */
enum Steuerabzug3aData {

    /** Amounts for the fiscal year 1985 */
    JAHR_1985(3974, 19872),
    /** Amounts for the fiscal year 1986 */
    JAHR_1986(4147, 20736),
    /** Amounts for the fiscal year 1987 */
    JAHR_1987(4147, 20736),
    /** Amounts for the fiscal year 1988 */
    JAHR_1988(4320, 21600),
    /** Amounts for the fiscal year 1989 */
    JAHR_1989(4320, 21600),
    /** Amounts for the fiscal year 1990 */
    JAHR_1990(4608, 23040),
    /** Amounts for the fiscal year 1991 */
    JAHR_1991(4608, 23040),
    /** Amounts for the fiscal year 1992 */
    JAHR_1992(5184, 25920),
    /** Amounts for the fiscal year 1993 */
    JAHR_1993(5414, 27072),
    /** Amounts for the fiscal year 1994 */
    JAHR_1994(5414, 27072),
    /** Amounts for the fiscal year 1995 */
    JAHR_1995(5587, 27936),
    /** Amounts for the fiscal year 1996 */
    JAHR_1996(5587, 27936),
    /** Amounts for the fiscal year 1997 */
    JAHR_1997(5731, 28656),
    /** Amounts for the fiscal year 1998 */
    JAHR_1998(5731, 28656),
    /** Amounts for the fiscal year 1999 */
    JAHR_1999(5789, 28944),
    /** Amounts for the fiscal year 2000 */
    JAHR_2000(5789, 28944),
    /** Amounts for the fiscal year 2001 */
    JAHR_2001(5933, 29664),
    /** Amounts for the fiscal year 2002 */
    JAHR_2002(5933, 29664),
    /** Amounts for the fiscal year 2003 */
    JAHR_2003(6077, 30384),
    /** Amounts for the fiscal year 2004 */
    JAHR_2004(6077, 30384),
    /** Amounts for the fiscal year 2005 */
    JAHR_2005(6192, 30960),
    /** Amounts for the fiscal year 2006 */
    JAHR_2006(6192, 30960),
    /** Amounts for the fiscal year 2007 */
    JAHR_2007(6365, 31824),
    /** Amounts for the fiscal year 2008 */
    JAHR_2008(6365, 31824),
    /** Amounts for the fiscal year 2009 */
    JAHR_2009(6566, 32832),
    /** Amounts for the fiscal year 2010 */
    JAHR_2010(6566, 32832),
    /** Amounts for the fiscal year 2011 */
    JAHR_2011(6682, 33408),
    /** Amounts for the fiscal year 2012 */
    JAHR_2012(6682, 33408),
    /** Amounts for the fiscal year 2013 */
    JAHR_2013(6739, 33696),
    /** Amounts for the fiscal year 2014 */
    JAHR_2014(6739, 33696),
    /** Amounts for the fiscal year 2015 */
    JAHR_2015(6768, 33840),
    /** Amounts for the fiscal year 2016 */
    JAHR_2016(6768, 33840),
    /** Amounts for the fiscal year 2017 */
    JAHR_2017(6768, 33840),
    /** Amounts for the fiscal year 2018 */
    JAHR_2018(6768, 33840),
    /** Amounts for the fiscal year 2019 */
    JAHR_2019(6826, 34128),
    /** Amounts for the fiscal year 2020 */
    JAHR_2020(6826, 34128),
    /** Amounts for the fiscal year 2021 */
    JAHR_2021(6883, 34416),
    /** Amounts for the fiscal year 2022 */
    JAHR_2022(6883, 34416),
    /** Amounts for the fiscal year 2023 */
    JAHR_2023(7056, 35280),
    /** Amounts for the fiscal year 2024 */
    JAHR_2024(7056, 35280),
    /** Amounts for the fiscal year 2025 */
    JAHR_2025(7258, 36288),
    /** Amounts for the fiscal year 2026 */
    JAHR_2026(7258, 36288),
    /** Amounts for the fiscal year 2027 */
    JAHR_2027(Integer.MIN_VALUE, Integer.MIN_VALUE); // TODO Preparing version 2027, change values, when they are known

    /**
     * Field to store the maximal deductible amount in CHF with an affiliation to the second pillar
     */
    final private int mitZweiteSaeule;
    /**
     * Field to store the maximal deductible amount in CHF without an affiliation to the second pillar
     */
    final private int ohneZweiteSaeule;

    /**
     * Constructor
     *
     * @param mitZweiteSaeule  the maximal deductible amount with a second pillar affiliation.
     * @param ohneZweiteSaeule the maximal deductible amount without a second pillar affiliation.
     */
    Steuerabzug3aData(int mitZweiteSaeule, int ohneZweiteSaeule) {
        this.mitZweiteSaeule = mitZweiteSaeule;
        this.ohneZweiteSaeule = ohneZweiteSaeule;
    }

    /**
     * Get the maximal deductible amount in CHF with an affiliation to the second pillar .
     *
     * @return the maximal deductible amount.
     */
    public int mitZweiteSaeule() {
        return this.mitZweiteSaeule;
    }

    /**
     * Get the maximal deductible amount in CHF without an affiliation to the second pillar.
     *
     * @return the maximal deductible amount.
     */
    public int ohneZweiteSaeule() {
        return this.ohneZweiteSaeule;
    }

}
