//207
public class func{
	public void setupSignRequestTest(String urlStr,String method){
        final URL url = new URL(urlStr);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method);
}
}
