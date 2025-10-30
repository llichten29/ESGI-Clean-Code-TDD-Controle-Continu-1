import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThrowTest {



    @Test
    public void Brelantest() {
        List<List<Integer>> dicesBrelan = Arrays.asList(
                Arrays.asList(1, 1, 1, 2, 3),
                Arrays.asList(1, 1, 1, 2, 3));
        int expected = 56;
        int actual = Throw.throwDice(dicesBrelan);
        assertEquals (expected, actual);

    }

    @Test
    public void Squaretest(){
        int expected = 35;

    }
}
