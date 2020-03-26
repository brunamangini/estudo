package romanNumeralsEncoder;

public class Conversion {
    public String solution(int n) {
        StringBuilder romanString = new StringBuilder();

        for (NumberToRomanEnum numberToRomanEnum : NumberToRomanEnum.values()) {
            n = handleEnumValue(n, romanString, numberToRomanEnum);
        }

        return romanString.toString();
    }

    private int handleEnumValue (int remainValue, StringBuilder romanString, NumberToRomanEnum numberToRomanEnum) {
        int number = numberToRomanEnum.number;

        while (remainValue >= number) {
            remainValue -= number;
            romanString.append(numberToRomanEnum.romanNumeral);
        }

        return remainValue;
    }
}
