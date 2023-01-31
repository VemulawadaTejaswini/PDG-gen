//170
public class func{
	public void httpCall(String url,String method,String params){
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setRequestMethod(method);
    connection.setDoOutput(true);
}
}
