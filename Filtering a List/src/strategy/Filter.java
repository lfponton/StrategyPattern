package strategy;

import context.Person;

public interface Filter
{
  boolean filter(Person person);
}
