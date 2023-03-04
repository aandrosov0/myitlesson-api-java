package ru.myitlesson.entity;

import java.util.List;

public class User extends Entity {
    public enum Role {
        ROOT("ROOT"),
        ADMIN("ADMIN"),
        TEACHER("TEACHER"),
        STUDENT("STUDENT");

        private final String role;

        Role(String role) {
            this.role = role;
        }

        @Override
        public String toString() {
            return role;
        }
    }

    protected String firstName;
    protected String lastName;

    protected Role role;

    protected List<Attend> attends;
    protected List<Course> courses;
    protected List<Grade> grades;

    public User(int id, String name, String firstName, String lastName, Role role, List<Course> courses, List<Grade> grades, List<Attend> attends) {
        super(id, name);
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.courses = courses;
        this.grades = grades;
        this.attends = attends;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Attend> getAttends() {
        return attends;
    }

    public void setAttends(List<Attend> attends) {
        this.attends = attends;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
