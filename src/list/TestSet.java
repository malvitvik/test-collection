package list;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestSet extends Test {
    private final Map<String, User> map;
    private TreeSet<User> users;


    public TestSet(Map<String, User> map) {
        this.map = map;
        changeComparator(null);
    }

    public Set<User> getSet() {
        return users;
    }

    public void changeComparator(Comparator<User> comparator) {
        users = comparator != null ? new TreeSet<>(comparator) : new TreeSet<>();
        users.addAll(map.values());
    }

    public void test() {
        System.out.println("TreeSet -> " + users);
        System.out.println("ceiling -> " + users.ceiling(new User("Den", 450)));
        System.out.println("floor -> " + users.floor(map.get("Toha2")));
        System.out.println("higher -> " + users.higher(map.get("Toha2")));
    }

    public int compare(Comparable<User> user) {
        return compare(users, user);
    }

    public void display() {
        display(users);
    }
}
