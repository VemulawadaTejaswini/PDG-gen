//140
public class func{
public void getHttpStatusCode(String urlstring,String userName){
    URL url = new URL(urlstring + "?user.name=" + userName);
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.connect();
    return connection.getResponseCode();
}
}
