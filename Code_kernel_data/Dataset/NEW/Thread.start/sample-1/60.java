//60
public class func{
public void startDeamonThread(boolean blockUntilStarted){
        Thread echoServerThread = new Thread(this);
        echoServerThread.setName("Echo server");
        echoServerThread.setDaemon(true);
        echoServerThread.start();
}
}
