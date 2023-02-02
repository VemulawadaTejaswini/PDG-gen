//48
public class func{
public void init(TreeLogger initialLogger){
    Thread thread = new Thread(this);
    thread.setDaemon(true);
    thread.setName("Code server (initializing)");
    thread.start();
}
}
