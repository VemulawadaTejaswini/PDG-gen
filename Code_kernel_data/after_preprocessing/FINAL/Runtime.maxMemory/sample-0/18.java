public class func{
public void uncaughtException(Thread t,Throwable e){
      Runtime rt = Runtime.getRuntime();
      message.append(String.format("-- Memory free: %4.2fMB total: %4.2fMB max: %4.2fMB",
          rt.freeMemory() / 1024 / 1024.0, 
          rt.totalMemory() / 1024 / 1024.0,
          rt.maxMemory() / 1024 / 1024.0));
}
}
