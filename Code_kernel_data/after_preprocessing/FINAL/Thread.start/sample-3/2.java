public class func{
public void init(Activity activity,Runnable postAction){
      final Thread initThread = new Thread(new Initializer(activity, postAction));
      initThread.setPriority(Thread.MIN_PRIORITY);
      initThread.start();
}
}
