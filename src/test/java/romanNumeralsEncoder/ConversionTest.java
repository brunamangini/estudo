package romanNumeralsEncoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTest {
    private final Conversion conversion = new Conversion();

    @Test
    void solution_whenStraightConversion_thenReturnRomanNumeral () {
        assertEquals("I", conversion.solution(1));
        assertEquals("II", conversion.solution(2));
        assertEquals("VIII", conversion.solution(8));
        assertEquals("MMX", conversion.solution(2010));
    }

    @Test
    void solution_whenNeedSubtractValuesToConvert_thenReturnRomanNumeral () {
        assertEquals("IV", conversion.solution(4));
        assertEquals("MDCLXVI", conversion.solution(1666));
    }

}
