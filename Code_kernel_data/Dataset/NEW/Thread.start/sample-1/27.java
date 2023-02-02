//27
public class func{
public void run(){
                Thread taskThread = new Thread(task);
                taskThread.setDaemon (true);
                taskThread.start();
}
}
