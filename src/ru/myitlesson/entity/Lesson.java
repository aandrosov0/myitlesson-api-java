package ru.myitlesson.entity;

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

    public Lesson(int id, String name, String content, Module module, int type, List<Task> tasks) {
        super(id, name);
        this.content = content;
        this.module = module;
        this.type = type;
        this.tasks = tasks;
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
