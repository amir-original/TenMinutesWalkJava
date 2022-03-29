import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TenMinutesWalkTest {

    @Test
    void Bayad_Barname_Check_Konad_Ke_PiadeRavi_Daghighan_10_Daghighe_Tol_Bekeshad_Va_Be_Noghte_Shoro_Baz_Gardad() {
        TenMinutesWalk tenMinutesWalk = new TenMinutesWalk(10);
        char[] walkDirections1 = {'w'};
        char[] walkDirections2 = {'n','s','n','s','n','s','n','s','n','s'};
        char[] walkDirections3 = {'w','e','w','e','w','e','w','e','w','e','w','e'};
        char[] walkDirections4 = {'n','n','n','s','n','s','n','s','n','s'};
        char[] walkDirections5 = {'n','n','n','n','n','s','s','s','s','s'};
        char[] walkDirections6 = {'n','n','w','s','e','w','n','e','s','s'};
        char[] walkDirections7 = {'w','n','w','s','e','w'};
        char[] walkDirections8 = {'n','e','w','s','n','s','n','e','w','s'};

        boolean result1  = tenMinutesWalk.isValid(walkDirections1);
        boolean result2 = tenMinutesWalk.isValid(walkDirections2);
        boolean result3 = tenMinutesWalk.isValid(walkDirections3);
        boolean result4 = tenMinutesWalk.isValid(walkDirections4);
        boolean result5 = tenMinutesWalk.isValid(walkDirections5);
        boolean result6 = tenMinutesWalk.isValid(walkDirections6);
        boolean result7 = tenMinutesWalk.isValid(walkDirections7);
        boolean result8 = tenMinutesWalk.isValid(walkDirections8);

        assertFalse(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
        assertTrue(result5);
        assertTrue(result6);
        assertFalse(result7);
        assertTrue(result8);

    }
}
