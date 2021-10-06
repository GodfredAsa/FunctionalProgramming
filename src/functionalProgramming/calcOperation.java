package functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class calcOperation implements Function<String, BiFunction<Integer,Integer,Integer>> {

    @Override
    public BiFunction<Integer, Integer, Integer> apply(String s) {
        if(s.equals("add")){
            class add implements BiFunction<Integer,Integer,Integer> {
                @Override
                public Integer apply(Integer i, Integer j) {
                    return i + j;
                }
            }
            return new add();
        }else if (s.equals("subtract")){
            class subtract implements BiFunction<Integer,Integer,Integer>{
                @Override
                public Integer apply(Integer i, Integer j) {
                    return i-j;
                }
            }
            return new subtract();
        } else if (s.equals("power")){
            class power implements BiFunction<Integer,Integer,Integer>{
                @Override
                public Integer apply(Integer i, Integer j) {
                    return (int) Math.pow(i,j);
                }
            }
            return new power();
        }

        return null;
    }
}