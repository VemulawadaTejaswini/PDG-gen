//336
public class func{
	public void LoadLocaleProviderTestHelper(URL[] classpathes){
        Thread thread = new Thread(this);
        thread.setContextClassLoader(loader);
        thread.start();
        thread.join();
}
}
