public class func{
public void testSetupUncaughtExceptionHandler(){
        Thread t = new Thread(new Runnable() {@Override public void run() {
            throw new RuntimeException();
        }});
        t.start();
        t.join();
}
}
