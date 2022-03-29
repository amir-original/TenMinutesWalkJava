import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TenMinutesWalkTest {

    @Test
    void Bayad_Check_Konad_Ke_PiadeRavi_10_Daghighan_Daghighe_Tol_Bekeshad_Va_Be_Noghte_Shoro_Baz_Gardad() {
        TenMinutesWalk tenMinutesWalk = new TenMinutesWalk(10);
        char[] walkDirections1 = {'w'};
        char[] walkDirections2 = {'n','s','n','s','n','s','n','s','n','s'};
        char[] walkDirections3 = {'w','e','w','e','w','e','w','e','w','e','w','e'};
        char[] walkDirections4 = {'n','n','n','s','n','s','n','s','n','s'};
        char[] walkDirections5 = {'n','n','n','n','n','s','s','s','s','s'};

        boolean result1  = tenMinutesWalk.isValid(walkDirections1);
        boolean result2 = tenMinutesWalk.isValid(walkDirections2);
        boolean result3 = tenMinutesWalk.isValid(walkDirections3);
        boolean result4 = tenMinutesWalk.isValid(walkDirections4);
        boolean result5 = tenMinutesWalk.isValid(walkDirections5);

        assertFalse(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
        assertTrue(result5);

    }
}
