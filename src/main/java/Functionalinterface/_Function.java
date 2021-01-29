package Functionalinterface;

import java.util.function.Function;

public class _Function {


    public static void main(String[] args) {

        int crement = increment(1);
        System.out.println(crement);

        int crementFunction = incrementFunctionbyOne.apply(1);
        System.out.println(crementFunction);

    }

    static public Function<Integer, Integer> incrementFunctionbyOne =
            integer -> integer++;

    static public int increment(int number)
    {
        return number++;

    }
}
