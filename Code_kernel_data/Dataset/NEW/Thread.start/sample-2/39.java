//39
public class func{
public void onShutdown(ApplicationEvent event){
      Thread selfDestructThread = new ShutdownBackstopThread(timeout);
      selfDestructThread.start();
}
}
