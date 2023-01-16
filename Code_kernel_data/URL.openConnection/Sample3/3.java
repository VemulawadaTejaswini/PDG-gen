//2
public class func{
	public void getInputStream(ClassLoader loader,boolean reload,String resourceName){
        if (!reload) { return loader.getResourceAsStream(resourceName); }
        URL url = loader.getResource(resourceName);
        if (url == null) { return null; }
        URLConnection connection = url.openConnection();
        if (connection == null) { return null; }
        connection.setUseCaches(false);
        return connection.getInputStream();
}
}
