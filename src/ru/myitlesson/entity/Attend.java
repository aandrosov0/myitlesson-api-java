package ru.myitlesson.entity;

import java.util.ArrayList;
import java.util.List;

public class Attend {
    /*public const IS_VALUE = 0;
    public const ISNT_VALUE = 1;    ????*/
    protected int id;
    protected int value;
    protected  DateTime date;
    protected Course course;

    protected List<User> users;

    public void __construct() {
        this.users = new ArrayList<>();
    }

    /* public static function new(int $value): Attend {
        return (new Attend())
            ->setValue($value);
    }   ????*/

    public int getId () {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return String.valueOf(this.value);
    }

    public void setValue (String value) {
        this.value = value;
    }

    public DateTime getDate() {
        return this.date;
    }

    public void setDate(DateTime date) {
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

    public void addUser(User user) {
        this.users.add(user);
        user.getAttends().add(this);
    }
}























