import java.util.*;

public class RollDice {

    public static final int BRELAN_POINT = 28;
    public static final int SQUARE_POINT = 35;
    public static final int FULL_POINT = 30;
    public static final int LARGE_SUITE_POINT = 40;
    public static final int YAMS_POINT = 40;


    public static int throwDice(List<List<Integer>> dices){
        int result = 0;
        for (List<Integer> dicesRoll : dices){
            Map<Integer,Integer> countMap = new HashMap<>();
            for (Integer dice : dicesRoll){
                countMap.put(dice, countMap.getOrDefault(dice, 0) + 1);
            }
            if(countMap.containsValue(3)){
                result+=BRELAN_POINT;
            }
            else if(countMap.containsValue(4)){
                result+=SQUARE_POINT;
            }
        }

        return result;
    }



}
