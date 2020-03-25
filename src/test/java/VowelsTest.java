import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {
    @Test
    void getCount_whenNoVowel_thenReturnZero() {
        assertEquals(0,Vowels.getCount("bcdfghjklmnpqrstvwxyz"));
    }
    @Test
    void getCount_whenHasVowels_thenReturnCountVowels() {
        assertEquals(0,Vowels.getCount("r"));
        assertEquals(0,Vowels.getCount("r wyz"));
        assertEquals(0,Vowels.getCount("r wyz thq"));

        assertEquals(1,Vowels.getCount("a"));
        assertEquals(1,Vowels.getCount("e"));
        assertEquals(1,Vowels.getCount("i"));
        assertEquals(1,Vowels.getCount("o"));
        assertEquals(1,Vowels.getCount("u"));
        assertEquals(1,Vowels.getCount("ri"));
        assertEquals(1,Vowels.getCount("or"));

        assertEquals(2,Vowels.getCount("ae"));
        assertEquals(2,Vowels.getCount("iu"));
        assertEquals(2,Vowels.getCount("ou"));
        assertEquals(2,Vowels.getCount("rattexxx"));
        assertEquals(2,Vowels.getCount("ittuqsd dws gth"));
        assertEquals(2,Vowels.getCount("dftg ou"));

        assertEquals(5,Vowels.getCount("uoiea"));

    }
}