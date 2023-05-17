public class func{
public void start(final int timeout){
                new Thread(new Runnable() {
                    public void run() {
                        sleep(timeout);
                        if (mRunning) timeout();
                    }
                }, "SipSessionTimerThread").start();
}
}
