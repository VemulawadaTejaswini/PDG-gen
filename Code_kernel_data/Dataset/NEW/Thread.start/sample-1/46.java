//46
public class func{
public void ControlListener(final int p){
        final Thread listener = new Thread(this);
        listener.setDaemon(true);
        listener.setName("Launchapd startup listener");
        listener.start();
}
}
