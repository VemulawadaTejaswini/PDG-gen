//68
public class func{
public void createPoller(){
        Thread t = new Thread(poller, "Poller " + getName());
        t.setDaemon(true);
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
}
}
