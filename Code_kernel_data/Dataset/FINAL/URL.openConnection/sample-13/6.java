public class func{
public void getURLinputStream(URL url){
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        connection.connect();
        return connection.getInputStream();
}
}
