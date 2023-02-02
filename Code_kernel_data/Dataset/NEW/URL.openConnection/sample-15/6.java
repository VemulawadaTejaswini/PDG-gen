//6
public class func{
public void setupConnection(URL url){
    URLConnection connection = url.openConnection();
    connection.setConnectTimeout(10000);
    connection.setReadTimeout(10000);
    connection.setUseCaches(false);
    connection.setDoInput(true);
    connection.setDoOutput(true);
}
}
