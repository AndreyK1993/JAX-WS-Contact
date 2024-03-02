package server.repository;

import server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tom", "+1234567890"));
        list.add(new Contact(2, "Alice", "+1987654321"));
        list.add(new Contact(3, "Bob", "+1650432876"));
        list.add(new Contact(4, "John", "+1789456321"));
        list.add(new Contact(5, "Emily", "+1567890432"));
        list.add(new Contact(6, "Michael", "+1345678901"));
        list.add(new Contact(7, "Sophia", "+1876543210"));


        return list;
    }
}
