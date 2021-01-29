package Functionalinterface;

import Consumer.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer
{
    public static void main(String[] args)
    {
        Customer vincentobj = new Customer("Vincent","99999999");
        greetCustumer(vincentobj);
        greetCustumerConsumer.accept(vincentobj);

        greetCustumerConsumerv2.accept(vincentobj, false);
    }

                //    INPUT
    static Consumer<Customer> greetCustumerConsumer = customer -> System.out.println("Hello "+customer.custumerName+" , thanks for registering phone number "+customer.custumerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustumerConsumerv2 = (customer, showPhoneNumber) -> System.out.println("Hello "+customer.custumerName+" , thanks for registering phone number "+
            (showPhoneNumber ? customer.custumerPhoneNumber : "***************"));



    static public void greetCustumer(Customer customer)
    {
        System.out.println("Hello "+customer.custumerName+" , thanks for registering phone number "+customer.custumerPhoneNumber);
    }



}
