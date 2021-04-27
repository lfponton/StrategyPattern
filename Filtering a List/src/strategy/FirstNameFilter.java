package strategy;

import context.Person;

public class FirstNameFilter implements Filter
{
  private String firstName;

  public FirstNameFilter(String firstName)
  {
    this.firstName = firstName;
  }

  @Override public boolean filter(Person person)
  {
    if (firstName.equals(person.getFirstName()))
    {
      return true;
    }
    return false;
  }
}
