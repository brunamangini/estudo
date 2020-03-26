package romanNumeralsEncoder;

public enum NumberToRomanEnum {
    THOUSAND("M", 1000),
    NINE_HUNDRED("CM", 900),
    FIVE_HUNDRED("D", 500),
    FOUR_HUNDED("CD", 400),
    HUNDRED("C", 100), 
    NINETY("XC", 90), 
    FIFTY("L", 50),
    FORTY("XL", 40),
    TEN("X", 10),
    NINE("IX", 9),
    FIVE("V", 5),
    FOUR("IV", 4),
    ONE("I", 1) ;

    String romanNumeral;
    int number;

    NumberToRomanEnum (String romanNumeral, int number) {
        this.romanNumeral = romanNumeral;
        this.number = number;
    }
}
