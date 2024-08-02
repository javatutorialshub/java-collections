package com.javatutorialshub.collections.queue;


import com.javatutorialshub.collections.set.Role;
import com.javatutorialshub.collections.set.User;
import com.javatutorialshub.collections.set.Value;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueManagementMain {
    public static void main(String[] args) {
        Queue<User> users = new ArrayBlockingQueue<>(10);
        Queue<Value> values = new PriorityQueue<>();
        Queue<Role> roles = new PriorityBlockingQueue<>();

        users.add(new User("Java", "TutorialsHub"));
        users.offer(new User("Java2", "TutorialsHub2"));

        values.add(new Value(100_000_000d, 200_000d));
        values.offer(new Value(100_000d, 200d));

        roles.add(new Role(1L, "admin", "Administrator"));
        roles.offer(new Role(2L, "admin", "Administrator"));

        User user = users.peek();
        Value value = values.peek();
        Role role = roles.peek();

        users.remove(user);
        values.remove(value);
        roles.remove(role);

        int size = users.size();
        int size1 = values.size();

        if(roles.isEmpty()) {

        }
    }
}