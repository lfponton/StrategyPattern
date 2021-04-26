package context;

public class Person
{
  private String firstName, lastName;
  private int age;

  public Person(String firstName, String lastName, int age)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public int getAge()
  {
    return age;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  @Override public String toString()
  {
    return "Person{" + "firstName='" + firstName + '\'' + ", lastName='"
        + lastName + '\'' + ", age=" + age + '}';
  }
}
