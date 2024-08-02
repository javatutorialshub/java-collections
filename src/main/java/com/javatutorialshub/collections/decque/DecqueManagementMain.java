package com.javatutorialshub.collections.decque;


import com.javatutorialshub.collections.set.Role;
import com.javatutorialshub.collections.set.User;
import com.javatutorialshub.collections.set.Value;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class DecqueManagementMain {
    public static void main(String[] args) {
        Deque<User> users = new ArrayDeque<>();
        Deque<Value> values = new LinkedBlockingDeque<>();

        users.add(new User("Java", "TutorialsHub"));
        users.offer(new User("Java2", "TutorialsHub2"));

        values.addLast(new Value(100_000_000d, 200_000d));
        values.offerLast(new Value(100_000d, 200d));

        users.addFirst(new User("Java", "TutorialsHub"));
        values.offerFirst(new Value(100_000d, 200d));


        User user = users.removeLast();
        Value value = values.removeLast();

        users.remove(user);
        values.remove(value);

        int size = users.size();
        int size1 = values.size();

        if(values.isEmpty()) {

        }
    }
}