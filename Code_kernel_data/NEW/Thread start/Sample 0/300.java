//299
public class func{
	public void start(){
        new Thread(new Runnable()
        {
            public void run() {
                startInternal();
            }
        }, "FreeMarker Debugger Server Acceptor").start();
}
}
