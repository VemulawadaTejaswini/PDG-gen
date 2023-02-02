//31
public class func{
	public void openConnection(URL u){
        final URL resourceUrl = classLoader.getResource(u.getPath());
        return resourceUrl != null ? resourceUrl.openConnection() : null;
}
}
