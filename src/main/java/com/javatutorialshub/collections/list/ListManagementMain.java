package com.javatutorialshub.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListManagementMain {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Value> values = new Vector<>();
        List<Role> roles = new LinkedList<>();

        users.add(new User("Java", "TutorialsHub"));
        values.add(new Value(100_000_000d, 200_000d));
        roles.add(new Role(1L, "admin", "Administrator"));

        User user = users.get(0);
        Value value = values.get(0);
        Role role = roles.get(0);

        users.remove(0);
        values.remove(0);
        roles.remove(0);

        int size = users.size();

        if(values.isEmpty()) {

        }
    }
}