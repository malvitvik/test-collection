package list;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    private final Map<String, User> map;
    private TreeMap<String, User> users;

    public TestMap(Map<String, User> map) {
        this.map = map;
        changeComparator(null);
    }

    public Map<String, User> getMap() {
        return users;
    }

    public void changeComparator(Comparator<String> comparator) {
        TreeMap<String, User> treeMap = comparator != null ? new TreeMap<>(comparator) : new TreeMap<>();
        treeMap.putAll(map);
    }

    public void testEntry(String key) {
        System.out.println("ceilingEntry -> " + users.ceilingEntry(key));
        System.out.println("floorEntry -> " + users.floorEntry(key));
        System.out.println("higherEntry -> " + users.higherEntry(key));
    }

    public void testKey(String key) {
        System.out.println("ceilingKey -> " + users.ceilingKey(key));
        System.out.println("floorKey -> " + users.floorKey(key));
        System.out.println("higherKey -> " + users.higherKey(key));
    }

    public void display() {
        System.out.println("TreeMap -> " + users);
    }
}
