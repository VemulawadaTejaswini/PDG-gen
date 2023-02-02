//217
public class func{
public void getURLContent_old(final String uri,final StringBuffer content){
    URL url = new URL( uri );
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.connect();
    InputStream in = connection.getInputStream();
}
}
