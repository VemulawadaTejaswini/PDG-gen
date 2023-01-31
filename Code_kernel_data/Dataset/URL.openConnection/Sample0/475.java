//474
public class func{
	public void testAccessSecured404(){
        URL url = serverHttpsUri.resolve("/nothing/here").toURL();
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setInstanceFollowRedirects(false);
        connection.setAllowUserInteraction(false);
}
}
