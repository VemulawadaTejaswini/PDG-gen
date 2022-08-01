//64
public class func{
	public void startAllDownloadTasks(){
    final List<Runnable> tasks = createDownloadTasks();
    outstandingDownloadTasks.set(tasks.size());
    for(Runnable r: tasks) {
      final Thread thread = new Thread(r);
      thread.start();
    }
}
}
