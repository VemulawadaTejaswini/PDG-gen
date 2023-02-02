//3
public class func{
public void openConnection(){
        URLConnection connection = url.openConnection(createProxy());
        connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLIS);
        connection.setReadTimeout(CONNECTION_TIMEOUT_MILLIS);
}
}
