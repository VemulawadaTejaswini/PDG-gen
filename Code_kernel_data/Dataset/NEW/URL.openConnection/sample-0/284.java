//284
public class func{
public void createConnection(String alias,int port){
        URL url = new URL("http", "localhost", port, alias);
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        urlConn.setReadTimeout(10 * 1000);
}
}
