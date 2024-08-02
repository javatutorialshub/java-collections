package com.javatutorialshub.collections.set;

import java.util.Objects;

public class Role implements Comparable<Role>{
    private Long id;
    private String name;
    private String description;

    public Role(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public int compareTo(Role o) {
        if(id.compareTo(o.id) == 0) {
            if(name.compareTo(o.name) == 0) {
                return description.compareTo(o.description);
            } else {
                return name.compareTo(o.name);
            }
        } else {
            return id.compareTo(o.id);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) && Objects.equals(name, role.name) && Objects.equals(description, role.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
