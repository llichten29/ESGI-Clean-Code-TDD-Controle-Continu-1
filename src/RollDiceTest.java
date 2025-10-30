import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RollDiceTest {



    @Test
    public void Brelantest() {
        List<List<Integer>> brelanDices = Arrays.asList(
                Arrays.asList(1, 1, 1, 2, 3),
                Arrays.asList(1, 1, 1, 2, 3));
        int expected = RollDice.BRELAN_POINT*2;
        int actual = RollDice.throwDice(brelanDices);
        assertEquals (expected, actual);

    }

    @Test
    public void Squaretest(){
        List<List<Integer>> squareDices = Arrays.asList(
                Arrays.asList(1, 1, 1, 1, 3),
                Arrays.asList(1, 1, 1, 1, 3));
        int expected = RollDice.SQUARE_POINT*2;
        int actual = RollDice.throwDice(squareDices);
        assertEquals (expected, actual);
    }
}
