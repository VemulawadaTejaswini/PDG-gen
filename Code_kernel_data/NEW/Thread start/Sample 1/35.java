//34
public class func{
	public void setUp(){
    int port = MetaStoreUtils.findFreePort();
    Thread t = new Thread(new RunMS(port));
    t.setDaemon(true);
    t.start();
}
}
