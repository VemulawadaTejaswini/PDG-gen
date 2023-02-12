public class func{
public void StopWatchTimer(){
      Thread timerThread = new Thread(this);
      timerThread.setDaemon(true);
      timerThread.start();
}
}
