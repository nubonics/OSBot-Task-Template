import java.util.ArrayList;
import java.util.List;

import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;

import task.ExampleTask;
import task.Task;

@ScriptManifest(author = "Nubonix",
                info = "",
                logo = "",
                name = "ScriptName",
                version = 0)

public class Main extends Script {

    private List<Task> tasks = new ArrayList<>();

    @Override
    public int onLoop() throws InterruptedException {

        boolean isActive = false;

        for (Task t : this.tasks) {

            boolean curActive = t.validate();
            isActive = isActive || curActive;

            if (curActive) {
                t.executor();
            }

            if (!isActive) {
                log("Cant find any state");
                sleep(5000);
            }
        }
        return 500;
    }

    public void onStart() {
        tasks.add(new ExampleTask().init(this));
        log("Tasks are now added to our list");
    }

    public void onExit() {
        log("Thank you for running SumoWoodcutter, hopefully you got some juicy levels");
    }

}