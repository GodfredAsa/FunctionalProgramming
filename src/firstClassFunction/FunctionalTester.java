package firstClassFunction;

public class FunctionalTester {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        SquareMaker squareMaker = item -> item * item* item;
        for (int j : array) {
            System.out.println(squareMaker.square(j));
        }


        System.out.println("Second functional Programming ");
        Added added = element -> 20 * element;
        for(int m: array){
            System.out.println(added.addition(m));
        }
    }
}

interface SquareMaker {
    double square(double item);
}

interface Added{
    int addition(int element);
}
