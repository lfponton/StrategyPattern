import context.MyArrayList;
import context.Person;
import strategy.AgeFilter;
import strategy.Filter;
import strategy.FirstNameFilter;

import java.util.ArrayList;

public class Test
{
  public static void main(String[] args)
  {
    MyArrayList persons = new MyArrayList();
    persons.add(new Person("James", "Rickers", 25));
    persons.add(new Person("Albert", "Lorentzen", 45));
    persons.add(new Person("Steffan", "Dahl", 15));
    Filter ageFilter = new AgeFilter(46);
    Filter nameFilter = new FirstNameFilter("James");
    persons.setFilter(nameFilter);
    MyArrayList filteredList = persons.getFiltered();
    for (int i = 0; i < filteredList.size(); i++)
    {
      System.out.println(filteredList.get(i).getFirstName());
    }
  }
}
