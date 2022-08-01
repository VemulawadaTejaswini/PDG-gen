//347
public class func{
	public void openConnection(final URL url){
        final URL proxyURL = new URL(url.toExternalForm());
        return proxyURL.openConnection();
}
}
