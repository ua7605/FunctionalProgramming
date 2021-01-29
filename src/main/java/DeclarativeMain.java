import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DeclarativeMain {

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
        personList.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        java.util.List<Person> maleList = personList.stream()
                .filter(person -> Gender.MALE.equals(person.gender))
                .collect(Collectors.toList());

        maleList.forEach(System.out::println);


    }
}
