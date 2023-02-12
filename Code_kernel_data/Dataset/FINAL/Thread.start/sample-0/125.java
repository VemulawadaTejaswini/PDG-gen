public class func{
public void setUp(){
    hsm = new HWISessionManager();
    Thread t = new Thread(hsm);
    t.start();
}
}
