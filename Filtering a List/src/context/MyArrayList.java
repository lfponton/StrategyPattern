package context;

import strategy.AgeFilter;
import strategy.Filter;
import strategy.FirstNameFilter;

import java.util.ArrayList;

public class MyArrayList implements  ListADT
{

    private Filter filter;
    private ArrayList<Person> implementation = new ArrayList();


    @Override public void add(Person p)
    {
        implementation.add(p);
    }

    @Override public void add(int idx, Person p)
    {
        implementation.add(idx, p);
    }

    @Override public void set(int idx, Person p)
    {
        implementation.set(idx, p);
    }

    @Override public Person get(int idx)
    {
        return implementation.get(idx);
    }

    @Override public Person remove(int idx)
    {
        return implementation.remove(idx);
    }

    @Override public boolean isEmpty()
    {
        return implementation.isEmpty();
    }

    @Override public int size()
    {
        return implementation.size();
    }

    public void setFilter(Filter filter)
    {
        this.filter = filter;
    }

    public MyArrayList getFiltered()
    {
        MyArrayList filteredList = new MyArrayList();
            for (Person p : implementation)
            {
                if (filter.filter(p))
                {
                    filteredList.add(p);
                }
            }
        return filteredList;
    }

}
