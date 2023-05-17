public class func{
public void init(){
    final Thread s = new Thread() {
      public void run() {
        AbstractImageEntry.this.initPlatform();
      }
    };
    s.start();
}
}
