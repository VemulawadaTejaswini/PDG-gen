public class func{
public void start(){
    networkWatchdogRunnable = new NetworkWatchdogRunnable();
    Thread t = new Thread(networkWatchdogRunnable, "NetworkWatchdogRunnable");
    t.setDaemon(true);
    t.start();
}
}
