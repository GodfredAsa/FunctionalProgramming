package highOrderFunction;

import java.util.function.Function;

public class FunctionTester {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        Function<Integer, Integer> square = t -> t * t;
        Function<Integer, Integer> cube = t -> t * t * t;

        for (int j : array) {
            print(square, j);
        }

        for (int j : array) {
            print(cube, j);
        }
    }

    private static <T, R> void print(Function<T, R> function, T t ) {
        System.out.println(function.apply(t));
    }
}