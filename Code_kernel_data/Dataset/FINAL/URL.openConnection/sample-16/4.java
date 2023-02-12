public class func{
public void readDTM(URL url){
        URLConnection connection = url.openConnection();
        connection.connect();
        return connection.getLastModified();
}
}
