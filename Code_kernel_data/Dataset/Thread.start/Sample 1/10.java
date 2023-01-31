//9
public class func{
	public void backgroundTask(Runnable task){
        Thread th = new Thread(task, task.getClass().getName());
        th.setDaemon(true);
        th.start();
}
}
