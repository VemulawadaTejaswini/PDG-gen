//203
public class func{
public void start(final StartContext context){
        final DeployTask task = new DeployTask();
        Thread thread = new Thread(new DeploymentTask(new OperationBuilder(task.getUpdate()).build()));
        thread.start();
}
}
