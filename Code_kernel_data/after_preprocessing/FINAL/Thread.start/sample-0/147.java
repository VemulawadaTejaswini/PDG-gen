public class func{
public void performTest(){
    new Thread(new Runnable() {
      @Override
      public void run() {
        waiter.assertTrue(false);
        waiter.resume();
      }
    }).start();
}
}
