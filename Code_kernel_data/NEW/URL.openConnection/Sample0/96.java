//95
public class func{
	public void httpPost(WebServer webServer,String path,String body){
        URL url = new URL(webServer.getUri().toURL(), path);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        urlConnection.setDoOutput(true);
}
}
