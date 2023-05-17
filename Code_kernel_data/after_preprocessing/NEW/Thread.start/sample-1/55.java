//55
public class func{
public void start(){
    Thread traceServer = new Thread(this);
    traceServer.setName("TraceServer");
    traceServer.setDaemon(true);
    traceServer.start();
}
}
