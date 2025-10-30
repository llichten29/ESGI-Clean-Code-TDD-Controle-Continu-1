import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RollDiceTest {



    @Test
    public void brelanTest() {
        List<List<Integer>> brelanDices = Arrays.asList(
                Arrays.asList(1, 1, 1, 2, 3),
                Arrays.asList(1, 1, 1, 2, 3));
        int expected = RollDice.BRELAN_POINT*2;
        int actual = RollDice.throwDice(brelanDices);
        assertEquals (expected, actual);

    }

    @Test
    public void squareTest(){
        List<List<Integer>> squareDices = Arrays.asList(
                Arrays.asList(1, 1, 1, 1, 3),
                Arrays.asList(1, 1, 1, 1, 3));
        int expected = RollDice.SQUARE_POINT*2;
        int actual = RollDice.throwDice(squareDices);
        assertEquals (expected, actual);
    }

    @Test
    public void fullTest(){
        List<List<Integer>> fullDices = Arrays.asList(
                Arrays.asList(1, 1, 1, 3, 3),
                Arrays.asList(1, 1, 1, 3, 3));
        int expected = RollDice.FULL_POINT*2;
        int actual = RollDice.throwDice(fullDices);
        assertEquals (expected, actual);
    }

    @Test
    public void yamsTest(){
        List<List<Integer>> fullDices = Arrays.asList(
                Arrays.asList(1, 1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 1, 1));
        int expected = RollDice.YAMS_POINT*2;
        int actual = RollDice.throwDice(fullDices);
        assertEquals (expected, actual);
    }

    @Test
    public void chanceTest(){
        List<List<Integer>> chanceDices = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 6),
                Arrays.asList(1, 2, 3, 4, 6));
        int expected = chanceDices.get(0).stream().reduce(0, Integer::sum)*2;
        int actual = RollDice.throwDice(chanceDices);
        assertEquals (expected, actual);
    }

    @Test
    public void largeSuiteTest(){
        List<List<Integer>> chanceDices = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(2, 3, 4, 5, 6));
        int expected = RollDice.LARGE_SUITE_POINT*2;
        int actual = RollDice.throwDice(chanceDices);
        assertEquals (expected, actual);
    }
}

