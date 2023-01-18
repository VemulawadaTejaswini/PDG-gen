//472
public class func{
	public void testRedirectUnsecuredRoot(){
        URL url = serverHttpUri.resolve("/").toURL();
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setInstanceFollowRedirects(false);
        connection.setAllowUserInteraction(false);
}
}
