import java.util.*;

public class RollDice {

    public static final int BRELAN_POINT = 28;
    public static final int SQUARE_POINT = 35;
    public static final int FULL_POINT = 30;
    public static final int LARGE_SUITE_POINT = 40;
    public static final int YAMS_POINT = 40;

    public static boolean isLargeSuite(List<Integer> dices){
        Set<Integer> unique = new TreeSet<>(dices);
        return unique.equals(new TreeSet<>(Arrays.asList(1,2,3,4,5)))
                || unique.equals(new TreeSet<>(Arrays.asList(2,3,4,5,6)));
    }


    public static int throwDice(List<List<Integer>> dices){
        int result = 0;
        for (List<Integer> dicesRoll : dices){
            Map<Integer,Integer> countMap = new HashMap<>();
            for (Integer dice : dicesRoll){
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
            else if (isLargeSuite(dicesRoll)){
                result+=LARGE_SUITE_POINT;
            }
            else{
                result+=dicesRoll.stream().reduce(0,Integer::sum);
            }
        }

        return result;
    }



}
