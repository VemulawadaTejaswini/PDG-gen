//165
public class func{
	public void googleIsReachable(){
            URL url = new URL("http://www.google.com");
                    (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();
            return HttpURLConnection.HTTP_OK == httpURLConnection
                    .getResponseCode();
}
}
