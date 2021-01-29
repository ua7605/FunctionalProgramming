package Functionalinterface;

import java.util.function.Predicate;

public class _Predicate
{
    public static void main(String[] args) {
        String phoneNumber = "07000000000";
        System.out.println(isPhoneNumberValid(phoneNumber));

        isPhoneNumberValidPredicate.test(phoneNumber);
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber));
    }
            // Predicate
            //Returns:
            //true if the input argument matches the predicate, otherwise false
                    //INPUT
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber)
    {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
