//27
public class func{
public void startSimpleWriter(String threadName,final OutputStream os,final int start){
        (new Thread(new Runnable() {
            public void run() {
                try { simpleWrite(os, start); }
                catch (Exception e) {unexpected(e); }
            }}, threadName)).start();
}
}
