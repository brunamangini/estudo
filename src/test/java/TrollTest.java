import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TrollTest {
    //private final Troll troll = new Troll();

    @Test
    void disemvowel_whenNull_thenReturnNull() {
        assertNull(Troll.disemvowel(null));
    }

    @Test
    void disemvowel_whenEmpty_thenReturnEmpty() {
        assertEquals("",Troll.disemvowel(""));
    }

    @Test
    void disemvowel_whenOnlyVowel_thenReturnEmpty() {
        assertEquals("",Troll.disemvowel("a"));
        assertEquals("",Troll.disemvowel("e"));
        assertEquals("",Troll.disemvowel("i"));
        assertEquals("",Troll.disemvowel("o"));
        assertEquals("",Troll.disemvowel("u"));

        assertEquals("",Troll.disemvowel("A"));
        assertEquals("",Troll.disemvowel("E"));
        assertEquals("",Troll.disemvowel("I"));
        assertEquals("",Troll.disemvowel("O"));
        assertEquals("",Troll.disemvowel("U"));

        assertEquals("",Troll.disemvowel("au"));
        assertEquals("",Troll.disemvowel("aeu"));

        assertEquals("",Troll.disemvowel("AU"));
        assertEquals("",Troll.disemvowel("AEU"));

    }

    @Test
    void disemvowel_whenHasVowel_thenReturnStringWithoutVowel() {
        assertEquals(" ",Troll.disemvowel("aeu aeu"));
        assertEquals(" ",Troll.disemvowel("AEU AEU"));
        assertEquals(" ",Troll.disemvowel("AU au"));
        assertEquals(" ",Troll.disemvowel("aeu AEU"));
        assertEquals("   ",Troll.disemvowel("AEU eio AEU eio"));

        assertEquals("C",Troll.disemvowel("Caeu"));
        assertEquals(" C",Troll.disemvowel("AEU CAEU"));
        assertEquals("C ",Troll.disemvowel("AUC au"));
        assertEquals("C M",Troll.disemvowel("aCeu AMEU"));
        assertEquals(" p P xY",Troll.disemvowel("AEU eipo APEU exiYo"));
    }

    //Site
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",Troll.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", Troll.disemvowel("What are you, a communist?"));
    }
}
