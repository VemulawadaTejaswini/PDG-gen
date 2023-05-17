//40
public class func{
public void start(boolean daemon){
      Thread serverThread = new Thread(this, "WOLips Server");
      serverThread.setDaemon(daemon);
      serverThread.start();
}
}
