public class func{
public void MyInputStream(String name,InputStream in){
        Thread thr = new Thread(this);
        thr.setDaemon(true);
        thr.start();
}
}
