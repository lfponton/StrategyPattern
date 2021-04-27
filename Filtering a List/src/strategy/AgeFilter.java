package strategy;

import context.Person;

public class AgeFilter implements Filter
{
  private int maxAge;
  public AgeFilter(int maxAge)
  {
    this.maxAge = maxAge;
  }

  @Override public boolean filter(Person person)
  {
    if (person.getAge() < maxAge)
    {
      return true;
    }
    return false;
  }
}
