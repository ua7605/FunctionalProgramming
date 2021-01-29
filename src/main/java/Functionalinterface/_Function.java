package Functionalinterface;

import java.util.function.Function;

public class _Function {


    public static void main(String[] args) {

        int crement = increment(1);
        System.out.println(crement);

        int crementFunction = incrementFunctionbyOne.apply(1);
        System.out.println(crementFunction);


        Integer twoFunctions = incrementFunctionbyOneANDTHENmultipleby10.apply(2);
        System.out.println(twoFunctions);

    }                   //  INPUT , OUTPUT
    static public Function<Integer, Integer> incrementFunctionbyOne =
            integer -> integer + 1;


    static public Function<Integer, Integer> multipleby10 =
            integer -> integer * 10;

    static public Function<Integer, Integer> incrementFunctionbyOneANDTHENmultipleby10 =
            incrementFunctionbyOne.andThen(multipleby10);

    static public int increment(int number)
    {
        return number++;
    }
}
