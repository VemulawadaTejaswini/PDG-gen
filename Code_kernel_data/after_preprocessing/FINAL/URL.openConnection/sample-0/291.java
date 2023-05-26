public class func{
public void createConnection(String url){
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setConnectTimeout(3000);
    connection.setReadTimeout(3000);
}
}
