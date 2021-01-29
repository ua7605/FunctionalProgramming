package Functionalinterface;

import java.util.function.Supplier;

public class _Supplier
{
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());
    }

    // A Supplier returns any kind of value you want to return.
           // <type of your output>
    static Supplier<String> getDBConnectionUrlSupplier = () ->
            "jdbc://localhost:5432/users";

    static String getDBConnectionUrl()
    {
        return "jdbc://localhost:5432/users";
    }
}
