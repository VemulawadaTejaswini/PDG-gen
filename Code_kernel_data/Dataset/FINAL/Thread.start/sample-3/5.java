public class func{
public void unlockInNewThread(final LockHandle handle,final AtomicBoolean wasUnlockedFirst){
        Thread t = new Thread(new Runnable() {
            public void run() {
                wasUnlockedFirst.set(true);
                handle.unlock();
            }
        });
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
}
}
