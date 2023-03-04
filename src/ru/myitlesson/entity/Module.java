package ru.myitlesson.entity;

import java.util.ArrayList;
import java.util.List;

public class Module extends Entity {

    protected Course course;
    protected String description;
    protected List<Lesson> lessons;
    protected List<Grade> grades;

    protected Module(int id, String name) {
        super(id, name);
    }

    /*public static function new(string $name, string $description): Module {
		return (new Module())
			->setDescription($description)
			->setName($name);
	}     ??????*/

    public void __construct() {
        this.lessons = new ArrayList<>();
        this.grades = new ArrayList<>();
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

    public  void addLessons(Lesson lesson) {
        this.lessons.add(lesson);
        lesson.setModule(this);
    }
}
