//65
public class func{
public void run(){
                    final Thread thr = new Thread(new Cleaner(), "XNIO cleaner thread");
                    thr.setDaemon(true);
                    thr.setContextClassLoader(null);
                    thr.start();
}
}
