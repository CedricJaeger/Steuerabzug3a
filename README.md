# Steuerabzug3a

## Description
Java enumeration with the values for the maximum deductible amounts of the [Swiss third pillar](https://www.bsv.admin.ch/de/die-dritte-saeule).

## Usage
Call the static methods of the `Steuerabzug3a` class to get the maximum deductible amount for a provided year. 

### Example 1
`int maximalAmountWithAffiliationForYear2025 = Steuerabzug3a.mitZweiteSaeule(2025);`

### Example 2
`int maximalAmountWithoutAffiliationForYear2025 = Steuerabzug3a.ohneZweiteSaeule(2025);`

## Source of the data
The current year is obtained from the [Federal Social Insurance Office](https://www.bsv.admin.ch/de/die-dritte-saeule#Steuerabzug) (FSIO) website directly.

The historic data is coming mainly from the PDF named "Chronologische Entwicklung der Gesetzgebung" that you can download on this [webpage](https://www.estv.admin.ch/estv/de/home/die-estv/steuerstatistiken-estv/allgemeine-steuerstatistiken/fiskaleinnahmen-des-bundes.html).

The maximum deductible amount is as follows :

| Year | With affiliation | Without affiliation |
|------|:----------------:|:-------------------:|
| 1985 |   CHF 3'974.-    |    CHF 19'872.-     |
| 1986 |   CHF 4'147.-    |    CHF 20'736.-     |
| 1987 |   CHF 4'147.-    |    CHF 20'736.-     |
| 1988 |   CHF 4'320.-    |    CHF 21'600.-     |
| 1989 |   CHF 4'320.-    |    CHF 21'600.-     |
| 1990 |   CHF 4'608.-    |    CHF 23'040.-     |
| 1991 |   CHF 4'608.-    |    CHF 23'040.-     |
| 1992 |   CHF 5'184.-    |    CHF 25'920.-     |
| 1993 |   CHF 5'414.-    |    CHF 25'920.-     |
| 1994 |   CHF 5'414.-    |    CHF 27'072.-     |
| 1995 |   CHF 5'587.-    |    CHF 27'936.-     |
| 1996 |   CHF 5'587.-    |    CHF 27'936.-     |
| 1997 |   CHF 5'731.-    |    CHF 28'656.-     |
| 1998 |   CHF 5'731.-    |    CHF 28'656.-     |
| 1999 |   CHF 5'789.-    |    CHF 28'944.-     |
| 2000 |   CHF 5'789.-    |    CHF 28'944.-     |
| 2001 |   CHF 5'933.-    |    CHF 29'664.-     |
| 2002 |   CHF 5'933.-    |    CHF 29'664.-     |
| 2003 |   CHF 6'077.-    |    CHF 30'384.-     |
| 2004 |   CHF 6'077.-    |    CHF 30'384.-     |
| 2005 |   CHF 6'192.-    |    CHF 30'960.-     |
| 2006 |   CHF 6'192.-    |    CHF 30'960.-     |
| 2007 |   CHF 6'365.-    |    CHF 31'874.-     |
| 2008 |   CHF 6'365.-    |    CHF 31'874.-     |
| 2009 |   CHF 6'566.-    |    CHF 32'832.-     |
| 2010 |   CHF 6'566.-    |    CHF 32'832.-     |
| 2011 |   CHF 6'682.-    |    CHF 33'408.-     |
| 2012 |   CHF 6'682.-    |    CHF 33'408.-     |
| 2013 |   CHF 6'739.-    |    CHF 33'696.-     |
| 2014 |   CHF 6'739.-    |    CHF 33'696.-     |
| 2015 |   CHF 6'768.-    |    CHF 33'840.-     |
| 2016 |   CHF 6'768.-    |    CHF 33'840.-     |
| 2017 |   CHF 6'768.-    |    CHF 33'840.-     |
| 2018 |   CHF 6'768.-    |    CHF 33'840.-     |
| 2019 |   CHF 6'826.-    |    CHF 34'128.-     |
| 2020 |   CHF 6'826.-    |    CHF 34'128.-     |
| 2021 |   CHF 6'883.-    |    CHF 34'416.-     |
| 2022 |   CHF 6'883.-    |    CHF 34'416.-     |
| 2023 |   CHF 7'056.-    |    CHF 35'280.-     |
| 2024 |   CHF 7'056.-    |    CHF 35'280.-     |
| 2025 |   CHF 7'258.-    |    CHF 36'288.-     |
| 2026 |   CHF 7'258.-    |    CHF 36'288.-     |

## Code convention
The code is written in German. Comments, documentation, error messages are in English.
