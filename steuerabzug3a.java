package link.jaeger.steuerabzug3a;

public enum Steuerabzug3a {

    // ENUM constants based on the PDF "Chronologische Entwicklung der Gesetzgebung"
    // https://www.estv.admin.ch/estv/de/home/die-estv/steuerstatistiken-estv/allgemeine-steuerstatistiken/fiskaleinnahmen-des-bundes.html
    JAHR_1985(3974,19872),
    JAHR_1986(4147,20736),
    JAHR_1987(4147,20736),
    JAHR_1988(4320,21600),
    JAHR_1989(4320,21600),
    JAHR_1990(4608,23040),
    JAHR_1991(4608,23040),
    JAHR_1992(5184,25920),
    JAHR_1993(5414,27072),
    JAHR_1994(5414,27072),
    JAHR_1995(5587,27936),
    JAHR_1996(5587,27936),
    JAHR_1997(5731,28656),
    JAHR_1998(5731,28656),
    JAHR_1999(5789,28944),
    JAHR_2000(5789,28944),
    JAHR_2001(5933,29664),
    JAHR_2002(5933,29664),
    JAHR_2003(6077,30384),
    JAHR_2004(6077,30384),
    JAHR_2005(6192,30960),
    JAHR_2006(6192,30960),
    JAHR_2007(6365,31824),
    JAHR_2008(6365,31824),
    JAHR_2009(6566,32832),
    JAHR_2010(6566,32832),
    JAHR_2011(6682,33408),
    JAHR_2012(6682,33408),
    JAHR_2013(6739,33696),
    JAHR_2014(6739,33696),
    JAHR_2015(6768,33840),
    JAHR_2016(6768,33840),
    JAHR_2017(6768,33840),
    JAHR_2018(6768,33840),
    JAHR_2019(6826,34128),
    JAHR_2020(6826,34128),
    JAHR_2021(6883,34416),
    JAHR_2022(6883,34416),
    JAHR_2023(7056,35280),
    JAHR_2024(7056,35280),
    JAHR_2025(7258,36288),
    JAHR_2026(7258,36288);

    // Field to store the maximal deductible amount in CHF with an affiliation to the 2nd pillar
    private int mitZweiteSaeule;
    // Field to store the maximal deductible amount in CHF without an affiliation to the 2nd pillar
    private int ohneZweiteSaeule;

    // Constructor
    private Steuerabzug3a(int mitZweiteSaeule , int ohneZweiteSaeule) {
        this.mitZweiteSaeule = mitZweiteSaeule;
        this.ohneZweiteSaeule = ohneZweiteSaeule;
    }

    // Get the maximal deductible amount in CHF with an affiliation to the 2nd pillar
    public int getMitZweiteSaeule() {
        return mitZweiteSaeule;
    }

    // Get the maximal deductible amount in CHF without an affiliation to the 2nd pillar
    public int getOhneZweiteSaeule() {
        return ohneZweiteSaeule;
    }

}
