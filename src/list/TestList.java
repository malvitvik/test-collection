package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestList extends Test {

    private final List<User> userList;

    public TestList(List<User> userList) {
        this.userList = userList;
    }

    public TestList(User... userArray) {
        this.userList = new ArrayList<>(Arrays.asList(userArray));
    }

    public List<User> getUserList() {
        return userList;
    }

    public void sort(Comparator<User> comparator) {
        userList.sort(comparator);
        display();
    }

    public int compare(Comparable<User> user) {
        return compare(userList, user);
    }

    public void display() {
        display(userList);
    }
}
