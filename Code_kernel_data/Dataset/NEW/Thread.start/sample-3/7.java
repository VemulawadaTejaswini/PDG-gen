//7
public class func{
public void initialize(){
        Thread saveThread = new Thread(new SaveRunnable());
        saveThread.setName("XWiki's extension job history saving thread");
        saveThread.setDaemon(true);
        saveThread.setPriority(Thread.MIN_PRIORITY);
        saveThread.start();
}
}
