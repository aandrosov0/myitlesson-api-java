package ru.myitlesson.entity;

public class Task extends Entity {

    protected String content;
    protected Lesson lesson;

    public Task(int id, String name, String content, Lesson lesson) {
        super(id, name);
        this.content = content;
        this.lesson = lesson;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Lesson getLesson() {
        return this.lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
