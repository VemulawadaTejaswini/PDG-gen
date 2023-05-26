public class func{
public void testUncaughtException(){
    Thread t = new Thread() {
      @Override
      public void run() {
        throw new RuntimeException("foobar");
      }
    };
    t.start();
    t.join();
}
}
