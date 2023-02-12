public class func{
public void testRedirectSecuredRoot(){
        URL url = serverHttpsUri.resolve("/").toURL();
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setInstanceFollowRedirects(false);
        connection.setAllowUserInteraction(false);
}
}
