package pl.codecity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setId(1L);
        p1.setFirstName("Adam");
        p1.setLastName("Nowak");
        p1.setEmail("adam@pl.pl");

        Person p2 = new Person();
        p2.setId(2L);
        p2.setFirstName("Ewa");
        p2.setLastName("Kowalska");
        p2.setEmail("ewaK@pl.pl");

        List<Person> persons = Collections.singletonList(p1);

        Insurance i1 = new Insurance(99L, p1.getEmail(), 11412.32);
        p1.addInsurance(new Insurance(100L, p1.getEmail(), 20046.24));
        p2.addInsurance(new Insurance(101L, p2.getEmail(), 25235.11));

        List<Person> people = Arrays.asList(p1, p2);
        List<Insurance> insurances = Arrays.asList(i1);

//        people.stream()
//                .map(Person::getEmail)
//                .forEach(System.out::println);
//
//        people.stream()
//                .map(Person::getInsurances)
//                .forEach(System.out.println(Arrays.toString()));

        insurances.stream()
                .map(insurance -> "id: " + insurance.getId() + " " + insurance.getEmail() + " " + insurance.getAmount())
                .forEach(System.out::println);

        System.out.println();
        people.stream()
                .map(person -> person.getId() + " " + person.getFirstName() + " " + person.getLastName() + " " + person.getInsurances())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.getInsurances().stream())
                .forEach(System.out::println);
        people.stream()
                .flatMap(person -> person.getInsurances().stream())
                .forEach(System.out::println);

        String a = people.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
        System.out.println(a);

    }
}
