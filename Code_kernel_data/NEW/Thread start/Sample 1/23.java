//22
public class func{
	public void start(){
    t = new Thread(new HeartbeatObserverRunnable(), "" + getSourceIdentifier() + "-HeartbeatObserver");
    t.setDaemon(false);
    t.start();
}
}
