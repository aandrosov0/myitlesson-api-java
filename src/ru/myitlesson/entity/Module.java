package ru.myitlesson.entity;

import java.util.List;

public class Module extends Entity {

    protected Course course;
    protected String description;
    protected List<Lesson> lessons;
    protected List<Grade> grades;

    protected Module(int id, String name, Course course, String description, List<Lesson> lessons, List<Grade> grades) {
        super(id, name);
        this.course = course;
        this.description = description;
        this.lessons = lessons;
        this.grades = grades;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Lesson> getLessons() {
        return this.lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
