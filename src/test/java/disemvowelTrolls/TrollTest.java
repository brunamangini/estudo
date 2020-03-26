package disemvowelTrolls;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TrollTest {
    @Test
    void disemvowel_whenNull_thenReturnNull() {
        assertNull(Troll.disemvowel(null));
    }

    @Test
    void disemvowel_whenEmpty_thenReturnEmpty() {
        Assertions.assertEquals("", Troll.disemvowel(""));
    }

    @Test
    void disemvowel_whenOnlyVowel_thenReturnEmpty() {
        Assertions.assertEquals("", Troll.disemvowel("a"));
        Assertions.assertEquals("", Troll.disemvowel("e"));
        Assertions.assertEquals("", Troll.disemvowel("i"));
        Assertions.assertEquals("", Troll.disemvowel("o"));
        Assertions.assertEquals("", Troll.disemvowel("u"));

        Assertions.assertEquals("", Troll.disemvowel("A"));
        Assertions.assertEquals("", Troll.disemvowel("E"));
        Assertions.assertEquals("", Troll.disemvowel("I"));
        Assertions.assertEquals("", Troll.disemvowel("O"));
        Assertions.assertEquals("", Troll.disemvowel("U"));

        Assertions.assertEquals("", Troll.disemvowel("au"));
        Assertions.assertEquals("", Troll.disemvowel("aeu"));

        Assertions.assertEquals("", Troll.disemvowel("AU"));
        Assertions.assertEquals("", Troll.disemvowel("AEU"));

    }

    @Test
    void disemvowel_whenHasVowel_thenReturnStringWithoutVowel() {
        Assertions.assertEquals(" ", Troll.disemvowel("aeu aeu"));
        Assertions.assertEquals(" ", Troll.disemvowel("AEU AEU"));
        Assertions.assertEquals(" ", Troll.disemvowel("AU au"));
        Assertions.assertEquals(" ", Troll.disemvowel("aeu AEU"));
        Assertions.assertEquals("   ", Troll.disemvowel("AEU eio AEU eio"));

        Assertions.assertEquals("C", Troll.disemvowel("Caeu"));
        Assertions.assertEquals(" C", Troll.disemvowel("AEU CAEU"));
        Assertions.assertEquals("C ", Troll.disemvowel("AUC au"));
        Assertions.assertEquals("C M", Troll.disemvowel("aCeu AMEU"));
        Assertions.assertEquals(" p P xY", Troll.disemvowel("AEU eipo APEU exiYo"));
    }

    //Site
    @Test
    public void FixedTests() {
        Assertions.assertEquals("Ths wbst s fr lsrs LL!", Troll.disemvowel("This website is for losers LOL!")
        );
        Assertions.assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        Assertions.assertEquals( "Wht r y,  cmmnst?", Troll.disemvowel("What are you, a communist?"));
    }
}
