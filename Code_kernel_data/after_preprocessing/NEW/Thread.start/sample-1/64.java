//64
public class func{
public void doExecuteNewThread(Runnable runnable,String name){
        String threadName = name + "-" + id.incrementAndGet();
        Thread thread = new Thread(runnable, threadName);
        thread.setDaemon(daemon);
        LOG.trace("Created and running thread[{}]: {}", threadName, thread);
        thread.start();
}
}
