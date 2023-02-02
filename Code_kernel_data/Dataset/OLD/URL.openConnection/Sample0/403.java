//402
public class func{
	public void createConnection(URL url,int timeout){
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setDoInput(true);
    connection.setDoOutput(true);
    connection.setRequestMethod("POST");
    connection.setConnectTimeout(timeout);
    connection.setReadTimeout(timeout);
    connection.setRequestProperty("User-Agent", "Die Fledermaus/11");
}
}
