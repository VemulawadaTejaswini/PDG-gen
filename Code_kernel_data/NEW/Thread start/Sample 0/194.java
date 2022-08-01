//193
public class func{
	public void initializeWatchServiceThread(){
        final Thread thread = new Thread(new JsonServiceRegistryConfigWatcher(this));
        thread.start();
}
}
