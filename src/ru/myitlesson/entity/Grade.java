package ru.myitlesson.entity;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    protected int id;
    protected int value;
    protected Module module;
    protected List<User> users;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Module getModule() {
        return this.module;
    }

    public void setModule (Module module) {
        this.module = module;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getId() {
        return this.id;
    }
}
