public class func{
public void start(Handler webCoreThreadHandler){
        if (sInstance == null) {
            sInstance = new WebCoreThreadWatchdog(webCoreThreadHandler);
            new Thread(sInstance, "WebCoreThreadWatchdog").start();
        }
}
}
