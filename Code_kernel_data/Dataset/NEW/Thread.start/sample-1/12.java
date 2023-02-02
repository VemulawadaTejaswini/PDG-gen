//12
public class func{
public void startListener(Listener l){
    Thread t = new Thread(l, "Listener-" + getKey(l.getListenerSpec()));
    t.setDaemon(true);
    t.start();
}
}
