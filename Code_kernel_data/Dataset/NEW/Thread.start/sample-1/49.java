//49
public class func{
public void start(){
        Thread t = new Thread(this);
        t.setDaemon(true);
        t.setName("attribute-event-bus");
        if (this.thread.compareAndSet(null, t)) {
            t.start();
        }
}
}
