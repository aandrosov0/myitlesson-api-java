package ru.myitlesson.entity;

import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import ru.myitlesson.exception.APIException;
import ru.myitlesson.MyItLessonAPI;

import java.io.IOException;
import java.util.ArrayList;

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

    protected int[] attends;
    protected int[] courses;
    protected int[] grades;

    public User(int id, String name, String firstName, String lastName, Role role, int[] courses, int[] grades, int[] attends) {
        super(id, name);
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.courses = courses;
        this.grades = grades;
        this.attends = attends;
    }

    public User() {

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

    public int[] getAttends() {
        return attends;
    }

    public void setAttends(int[] attends) {
        this.attends = attends;
    }

    public int[] getCourses() {
        return courses;
    }

    public void setCourses(int[] courses) {
        this.courses = courses;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public static User getUser(MyItLessonAPI api, int id) throws IOException, APIException {
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("id", String.valueOf(id)));

        return api.sendPostWithToken("user/getUser", params, User.class);
    }
}
