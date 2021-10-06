package Java4Labs;

import java.util.List;
import java.util.function.BiFunction;

@FunctionalInterface
public interface Zip extends BiFunction<List<String>,List<String>,List<String>>{

}
