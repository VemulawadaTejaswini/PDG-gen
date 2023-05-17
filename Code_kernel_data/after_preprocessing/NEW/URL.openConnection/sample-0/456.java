//456
public class func{
public void getConnection(URL url,int timeout){
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setInstanceFollowRedirects(true);
    connection.setConnectTimeout(timeout);
}
}
