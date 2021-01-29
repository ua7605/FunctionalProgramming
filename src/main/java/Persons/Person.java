package Persons;

public class Person {

    public final String name;
    public final Gender gender;


    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender gender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return "Persons.Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
