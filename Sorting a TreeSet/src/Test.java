import context.Person;
import strategy.AgeComparator;
import strategy.LastNameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Test
{
  public static void main(String[] args)
  {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("James", "Rickers", 25));
    persons.add(new Person("Albert", "Lorentzen", 45));
    persons.add(new Person("Steffan", "Dahl", 15));
    for(Person p : persons) {
      System.out.println(p.getFirstName());
    }
    Collections.sort(persons, new LastNameComparator());
    System.out.println("After sort by last name: ");
    for(Person p : persons) {
      System.out.println(p.getFirstName());
    }
    Collections.sort(persons, new AgeComparator());
    System.out.println("After sort by age: ");
    for(Person p : persons) {
      System.out.println(p.getFirstName());
    }

    TreeSet<Person> people = new TreeSet<>(new AgeComparator());
    people.add(new Person("James", "Rickers", 25));
    people.add(new Person("Albert", "Lorentzen", 45));
    people.add(new Person("Steffan", "Dahl", 15));
    System.out.println("After sort by last name: ");
    for(Person p : people) {
      System.out.println(p.getFirstName());
    }
  }
}
