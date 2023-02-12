public class func{
public void StreamMonitor(InputStream istr,String prefixString,boolean printContents){
    Thread thr = new Thread(this);
    thr.setDaemon(true);
    thr.start();
}
}
