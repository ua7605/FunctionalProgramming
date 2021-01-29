package Streams;

import Persons.Gender;
import Persons.Person;
import com.sun.tools.javac.util.List;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Vincent", Gender.MALE),
                new Person("Jan",Gender.MALE),
                new Person("Maria",Gender.FEMALE),
                new Person("Charlotte",Gender.FEMALE),
                new Person("Steve",Gender.MALE),
                new Person("Steve",Gender.FEMALE)
        );
        personList.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        personList.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean isFemale = personList.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(isFemale);

        Optional<Person> max = personList.stream()
                .max(Comparator.comparing(person -> person.name.length()));
        System.out.println(max.get().name);


    }



    }



