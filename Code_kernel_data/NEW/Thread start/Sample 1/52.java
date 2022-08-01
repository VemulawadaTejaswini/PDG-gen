//51
public class func{
	public void start(){
    Thread callbackConnectionThread = new Thread(this);
    callbackConnectionThread.setDaemon(true);
    callbackConnectionThread.setName("InTrace-Launch-CallbackHandler");
    callbackConnectionThread.start();
}
}
