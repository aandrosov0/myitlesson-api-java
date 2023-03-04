package ru.myitlesson.entity;

import java.util.ArrayList;
import java.util.List;

public class Lesson extends Entity {

    /*public const CONTROL_TYPE = 0;
    public const LESSON_TYPE = 1;   ??????*/
    protected String content;
    protected Module module;
    protected int type;
    protected List<Task> tasks;

    protected Lesson(int id, String name) {
        super(id, name);
    }

    public void __construct() {
        this.tasks = new ArrayList<>();
    }

    /*public static function new(string $name, string $content, int $type): Lesson {
		return (new Lesson())
			->setContent($content)
			->setType($type)
			->setName($name);
	}     ?????*/

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

    public void addTasks(Task task) {
        this.tasks.add(task);
        task.setLesson(this);
    }

    /*public static function typeToString(int $type): string|null {
		switch($type) {
			case static::CONTROL_TYPE: return 'Контрольная';
			case static::LESSON_TYPE: return 'Урок';
		}
		return null;
	}    ?????*/
}
