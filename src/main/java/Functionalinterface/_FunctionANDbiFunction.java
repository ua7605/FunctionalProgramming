package Functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _FunctionANDbiFunction {


    public static void main(String[] args) {

        int crement = increment(1);
        System.out.println(crement);

        int crementFunction = incrementFunctionbyOne.apply(1);
        System.out.println(crementFunction);


        Integer twoFunctions = incrementFunctionbyOneANDTHENmultipleby10.apply(2);
        System.out.println(twoFunctions);

        Integer biFunctional = incrementbytwo_Function.apply(2, 100);

        System.out.println(biFunctional);


    }                   //  INPUT , OUTPUT
    static public Function<Integer, Integer> incrementFunctionbyOne =
            integer -> integer + 1;

                        //  INPUT , OUTPUT
    static public Function<Integer, Integer> multipleby10 =
            integer -> integer * 10;

    static public Function<Integer, Integer> incrementFunctionbyOneANDTHENmultipleby10 =
            incrementFunctionbyOne.andThen(multipleby10);

    static public int increment(int number)
    {
        return number+ 1;
    }



                          //  INPUT , INPUT  , OUTPUT
    static public BiFunction<Integer, Integer, Integer> incrementbytwo_Function =
                                  (numberONE, numbertwo ) -> (numberONE + 1) * numbertwo;

    static public int incrementbytwo(int numberONE, int numbertwo)
    {
        return (numberONE + 1 ) * numbertwo;
    }

}
