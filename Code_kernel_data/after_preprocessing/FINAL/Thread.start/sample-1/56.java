public class func{
public void run(Runnable runnable,String threadName,boolean daemon){
    Thread thread = new Thread(runnable, threadName);
    thread.setName(threadName);
    thread.setDaemon(daemon);
    thread.start();
}
}
