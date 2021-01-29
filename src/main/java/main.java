import com.sun.tools.javac.util.List;
import com.sun.tools.javah.Gen;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Vincent",Gender.MALE),
                new Person("Jan",Gender.MALE),
                new Person("Maria",Gender.FEMALE),
                new Person("Charlotte",Gender.FEMALE),
                new Person("Steve",Gender.MALE)
        );


        // Imperative approach:

        ArrayList<Person> females = new ArrayList<>();

        for (Person index: personList){
            if(Gender.FEMALE.equals(index.gender))
            {
                females.add(index);
            }
        }

        ArrayList<Person> males = new ArrayList<>();
        for (Person index: personList)
        {
            if (Gender.MALE.equals(index.gender))
            {
                males.add(index);
            }
        }
        //---------------------------------------------

        // Declarative approach:








    }
}
