package vowelCount;

import org.junit.jupiter.api.Test;
import vowelCount.Vowels;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {
    @Test
    void getCount_whenNoVowel_thenReturnZero() {
        assertEquals(0, Vowels.getCount("bcdfghjklmnpqrstvwxyz"));
        assertEquals(0, Vowels.getCount2("bcdfghjklmnpqrstvwxyz"));
        assertEquals(0, Vowels.getCount3("bcdfghjklmnpqrstvwxyz"));
    }

    @Test
    void getCount_whenHasONlyConsoants_thenReturnZero() {
        assertEquals(0,Vowels.getCount("r"));
        assertEquals(0,Vowels.getCount("r wyz"));
        assertEquals(0,Vowels.getCount("r wyz thq"));
        assertEquals(0,Vowels.getCount2("r wyz thq"));
        assertEquals(0,Vowels.getCount3("r wyz thq"));
    }

    @Test
    void getCount_whenHasVowels_thenReturnCountVowels() {
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
        assertEquals(2,Vowels.getCount("dftg ou"));
        assertEquals(2,Vowels.getCount("ittuqsd dws gth"));
        assertEquals(2,Vowels.getCount2("ittuqsd dws gth"));
        assertEquals(2,Vowels.getCount3("ittuqsd dws gth"));

        assertEquals(5,Vowels.getCount("uoiea"));
        assertEquals(5,Vowels.getCount2("uoiea"));
        assertEquals(5,Vowels.getCount3("uoiea"));
    }

    @Test
    void getCount_whenMultipleVowelsAndConsoants_thenReturnCountVowels () {
        assertEquals(5, Vowels.getCount("qwe asd zxc qwir rtyu polk"));
        assertEquals(5, Vowels.getCount2("qwe asd zxc qwir rtyu polk"));
        assertEquals(5, Vowels.getCount3("qwe asd zxc qwir rtyu polk"));
    }
}