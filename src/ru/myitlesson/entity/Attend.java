package ru.myitlesson.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Attend {
    protected int id;
    protected int value;
    protected LocalDateTime date;
    protected Course course;

    protected List<User> users;

    public Attend(int id, int value, LocalDateTime date, Course course, List<User> users) {
        this.id = id;
        this.value = value;
        this.date = date;
        this.course = course;
        this.users = users;

    }

    public int getId () {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return String.valueOf(this.value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Course getCourse() {
        return this.course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}























