package server.repository;

import oserver.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<User> fetchData() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Tom", "tom@mail.com"));
        list.add(new User(2, "Alice", "alice@mail.com"));
        list.add(new User(3, "Bob", "bob@mail.com"));
        return list;
    }
}
