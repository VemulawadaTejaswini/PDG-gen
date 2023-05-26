//106
public class func{
public void initialize(){
    new Thread(new Runnable() {
      @Override
      public void run() {
        storage2UriMapperJavaImpl.initializeCache();
      }
    }).start();
}
}
