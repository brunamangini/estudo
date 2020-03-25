import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class TrollTest {
    //private final Troll troll = new Troll();

    @Test
    void disemvowel_whenNull_thenReturnNull() {
        assertNull(Troll.disemvowel(null));
    }
}
