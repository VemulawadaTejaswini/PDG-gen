//32
public class func{
	public void handle(InputStream in){
            IOHandler handler = new IOHandler(in);
            Thread thr = new Thread(handler);
            thr.setDaemon(true);
            thr.start();
}
}
