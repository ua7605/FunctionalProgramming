import com.sun.tools.javac.util.List;

public class main {

    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Vincent",Gender.MALE),
                new Person("Jan",Gender.MALE),
                new Person("Maria",Gender.FEMALE),
                new Person("Charlotte",Gender.FEMALE)
        );




    }
}
