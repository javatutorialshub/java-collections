package com.javatutorialshub.collections.set;


import java.util.*;

public class SetManagementMain {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        Set<Value> values = new LinkedHashSet<>();
        Set<Role> roles = new TreeSet<>();

        users.add(new User("Java", "TutorialsHub"));
        values.add(new Value(100_000_000d, 200_000d));
        roles.add(new Role(1L, "admin", "Administrator"));

        Iterator<User> userIterator = users.iterator();
        User user = null;
        if(userIterator.hasNext()) {
            user = userIterator.next();
        }

        Iterator<Value> valueIterator = values.iterator();
        Value value = null;
        if(valueIterator.hasNext()) {
            value = valueIterator.next();
        }

        Iterator<Role> roleIterator = roles.iterator();
        Role role = null;
        if(roleIterator.hasNext()) {
            role = roleIterator.next();
        }

        users.remove(user);
        values.remove(value);
        roles.remove(role);

        int size = users.size();
        int size1 = values.size();

        if(roles.isEmpty()) {

        }
    }
}