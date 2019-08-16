package list;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        User[] userArray = {new User("Vadym", 4000), new User("Denys", 400),
                new User("Toha", 500), new User("Max", 600), new User("Toha2", 400)};

        User user = new User("User", 550);

        Comparator<User> comparatorAsc = Comparator.comparingInt(User::getAccount);
        Comparator<User> comparatorDesc = (o1, o2) -> Integer.compare(o2.getAccount(), o1.getAccount());

        testUserList(userArray, user, comparatorAsc, comparatorDesc);

        Map<String, User> map = new HashMap<>();
        putUser(map, userArray);

        TestSet testSet = new TestSet(map);

        testUserSet(testSet, comparatorAsc, user);
        testUserSet(testSet, comparatorDesc, user);

        TestMap testMap = new TestMap(map);

        testTreeMap(testMap, Comparator.naturalOrder());
        testTreeMap(testMap, Comparator.reverseOrder());
    }

    private static void testUserList(User[] userArray, User user, Comparator<User> comparatorAsc, Comparator<User> comparatorDesc) {
        TestList testList = new TestList(userArray);

        testList.display();
        testList.sort(comparatorDesc);
        testList.sort(comparatorAsc);
        int index = testList.compare(user);
        testList.getUserList().add(index, user);
        testList.display();
    }

    private static void testUserSet(TestSet testSet, Comparator<User> comparatorDesc, User user) {
        testSet.changeComparator(comparatorDesc);
        testSet.test();
        testSet.display();
        testSet.getSet().add(user);
        testSet.display();
    }


    private static void testTreeMap(TestMap testMap, Comparator<String> comparator) {
        testMap.changeComparator(comparator);

        testMap.display();
        testMap.testEntry("B");
        testMap.testKey("B");
    }

    private static void putUser(Map<String, User> map, User... users) {
        for (User user : users) {
            map.put(user.getName(), user);
        }
    }
}