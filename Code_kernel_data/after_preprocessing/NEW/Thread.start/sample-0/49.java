//49
public class func{
public void getLiveNotificationThread(){
    if(singleton == null)
    {
      singleton = new LiveNotificationThread();
      Thread thread = new Thread (singleton);
      thread.start();
    }
}
}
