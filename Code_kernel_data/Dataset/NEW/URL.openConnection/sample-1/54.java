//54
public class func{
public void readFrom(String spec){
    URLConnection connection = new URL(spec).openConnection();
    connection.setConnectTimeout(5000);
    connection.setDoOutput(true);
    return connection.getInputStream();
}
}
