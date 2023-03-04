package ru.myitlesson.entity;

import java.util.ArrayList;
import java.util.List;

public class Course extends Entity {
    protected String description;
    protected List<Module> modules;
    protected List<User> users;
    protected List<Attend> attends;

    public Course(int id, String name) {
        super(id, name);
    }

    public void __construct() {
        this.modules = new ArrayList<>();
        this.users = new ArrayList<>();
        this.attends = new ArrayList<>();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Module> getModules() {
        return this.modules;
    }
    public void setModules (List<Module> modules) {
        this.modules = modules;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
