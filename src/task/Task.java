package task;

import org.osbot.rs07.script.Script;

public abstract class Task {

    Script script;

    public Task init(Script script) {
        this.script = script;

        return this;
    }

    public abstract boolean validate();

    public abstract void executor() throws InterruptedException;

}