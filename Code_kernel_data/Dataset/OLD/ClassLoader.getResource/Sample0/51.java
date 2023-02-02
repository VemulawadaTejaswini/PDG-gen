//50
public class func{
	public void getInputStream(ClassLoader loader,String resourceName,boolean reload){
        URL url = loader.getResource(resourceName);
        if (url == null) {
            return null;
        }
        URLConnection connection = url.openConnection();
        connection.setUseCaches(!reload);
        return connection.getInputStream();
}
}
