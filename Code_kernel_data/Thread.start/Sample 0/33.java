//32
public class func{
	public void runOnSeparateThread(final Runnable runnable){
        Thread thread = new Thread(runnable);
        thread.start();
            thread.join();
}
}
