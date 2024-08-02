package com.javatutorialshub.collections.set;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private String firstName;

    public User(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    @Override
    public int compareTo(User o) {
        if(name.compareTo(o.name) == 0) {
            return firstName.compareTo(o.firstName);
        } else {
            return name.compareTo(o.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(firstName, user.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}