package ru.myitlesson.entity;

import java.util.ArrayList;
import java.util.List;

public class Course extends Entity {
    protected String description;
    protected List<Module> modules;
    protected List<User> users;
    protected List<Attend> attends;

    protected Course(int id, String name) {
        super(id, name);
    }

    public void __construct() {
        this.modules = new ArrayList<>();
        this.users = new ArrayList<>();
        this.attends = new ArrayList<>();
    }
    /*public static function new(string $name, string $description): Course {
		return (new Course())
			->setDescription($description)
			->setName($name);
	}    ?????*/

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

    public void addModules(Module module) {
        this.modules.add(module);
        module.setCourse(this);
    }

    public void addUser(User user) {
        this.users.add(user);
        user.getCourses().add(this);
    }

    public void removeUser (User user) {
        this.users.removeElement(user);
        user.getCourses().removeElement(this);
    }








}
