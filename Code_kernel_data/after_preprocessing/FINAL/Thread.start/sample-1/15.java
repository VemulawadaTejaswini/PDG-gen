public class func{
public void activate(){
        final Thread thread = new Thread(this, "Apache Sling Timed Job Topology Listener Thread");
        thread.setDaemon(true);
        thread.start();
}
}
