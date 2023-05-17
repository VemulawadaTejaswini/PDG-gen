public class func{
public void startDaemonThread(boolean blockUntilStarted){
        Thread serverThread = new Thread(this);
        serverThread.setName("Listen server");
        serverThread.setDaemon(true);
        serverThread.start();
}
}
