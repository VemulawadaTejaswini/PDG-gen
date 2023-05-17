//33
public class func{
public void start(){
    final Thread dispatchThread = new Thread(getCollectionJob(), getName());
    dispatchThread.setDaemon(false);
    dispatchThread.start();
}
}
