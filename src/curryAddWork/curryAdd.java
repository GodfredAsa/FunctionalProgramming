package curryAddWork;

import java.util.function.Function;

//create a class curryAdd that takes an Integer returns Function which also takes an integer and also returns integer
public class curryAdd implements Function<Integer, Function<Integer, Integer>>{

    @Override
    public Function<Integer, Integer> apply(Integer integer) {
        class add implements Function<Integer, Integer>{

            @Override
            public Integer apply(Integer integer) {
                return integer + 1;
            }
        }
        return new add();
    }
}
