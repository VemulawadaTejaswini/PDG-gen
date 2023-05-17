public class func{
public void start(){
    updateHeartbeatTimestamp();
    Thread t = new Thread(new ReceiverRunnable(getSourceIdentifier()), "" + getSourceIdentifier() + "-Receiver");
    t.setDaemon(false);
    t.start();
}
}
