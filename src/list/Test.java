package list;

import java.util.Iterator;

public class Test {

    public void display(Iterable<User> iterable) {
        System.out.println("-------Iterator-------");

        Iterator<User> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");
    }

    public int compare(Iterable<User> iterable, Comparable<User> user) {
        int index = 0;
        Iterator<User> iterator = iterable.iterator();

        while (iterator.hasNext() && user.compareTo(iterator.next()) > 0) {
            index++;
        }

        return index;
    }
}
