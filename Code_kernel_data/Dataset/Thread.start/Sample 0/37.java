//36
public class func{
	public void runInNewThread(final Runnable command,final Executor executor){
        Thread t = new Thread(new Runnable() {
            public void run() {
                executor.execute(command);
            }
        });
        t.start();
}
}
