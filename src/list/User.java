package list;

public class User implements Comparable<User> {
    private String name;
    private int account;

    public User(String name, int account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    @Override
    public int compareTo(User user) {
        return Integer.compare(this.account, user.account);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
