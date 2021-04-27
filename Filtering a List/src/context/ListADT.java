package context;

public interface ListADT {
    void add(Person p);
    void add(int idx, Person p);
    void set(int idx, Person p);
    public Person get(int idx);
    public Person remove(int idx);
    public boolean isEmpty();
    public int size();
}
