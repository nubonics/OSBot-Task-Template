package task;

public class ExampleTask extends Task{

    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public void executor() throws InterruptedException {

    }
}