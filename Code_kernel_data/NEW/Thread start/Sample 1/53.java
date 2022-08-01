//52
public class func{
	public void exec(Runnable code){
            Thread t = new Thread(code);
            t.setDaemon(true);
            t.setName("NanoHttpd Request Processor (#" + requestCount + ")");
            t.start();
}
}
