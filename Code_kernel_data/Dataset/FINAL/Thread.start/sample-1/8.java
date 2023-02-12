public class func{
public void startListening(){
    final Thread thread = new Thread(this);
    thread.setDaemon(true);
    thread.start();
}
}
