package ru.myitlesson.entity;

import java.util.ArrayList;
import java.util.List;

public class Lesson extends Entity {

    public enum Type {
        CONTROL_TYPE,
        LESSON_TYPE,
    }

    protected String content;
    protected Module module;
    protected int type;
    protected List<Task> tasks;

    protected Lesson(int id, String name) {
        super(id, name);
    }

    public String getContent(String content) {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
