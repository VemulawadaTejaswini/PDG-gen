//24
public class func{
	public void getInstance(){
      if(instance == null)
      {
        instance = new LiveInstanceMonitor();
        Thread thread = new Thread(instance);
      thread.start();
      }
}
}
