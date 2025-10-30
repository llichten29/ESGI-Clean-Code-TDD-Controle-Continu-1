import java.util.*;

public class RollDice {

    public static final int BRELAN_POINT = 28;
    public static final int SQUARE_POINT = 35;
    public static final int FULL_POINT = 30;
    public static final int LARGE_SUITE_POINT = 40;
    public static final int YAMS_POINT = 40;

    public static boolean isLargeSuite(List<Integer> dices){
        Set<Integer> diceUnique = new TreeSet<>(dices);
        return diceUnique.equals(new TreeSet<>(Arrays.asList(1,2,3,4,5)))
                || diceUnique.equals(new TreeSet<>(Arrays.asList(2,3,4,5,6)));
    }


    public static int throwDice(List<List<Integer>> dicesRolls){
        int result = 0;
        for (List<Integer> dices : dicesRolls){
            Map<Integer,Integer> countMap = new HashMap<>();
            for (Integer dice : dices){
                countMap.put(dice, countMap.getOrDefault(dice, 0) + 1);
            }
            if(countMap.containsValue(3)){
                if(countMap.containsValue(2)){
                    result+=FULL_POINT;
                }
                else {
                    result += BRELAN_POINT;
                }
            }
            else if(countMap.containsValue(4)){
                result+=SQUARE_POINT;
            }
            else if(countMap.containsValue(5)){
                result+=YAMS_POINT;
            }
            else if (isLargeSuite(dices)){
                result+=LARGE_SUITE_POINT;
            }
            else{
                result+=dices.stream().reduce(0,Integer::sum);
            }
        }

        return result;
    }



}
