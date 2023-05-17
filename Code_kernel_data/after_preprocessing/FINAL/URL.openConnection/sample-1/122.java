public class func{
public void getHttpInputStream(String endpointAddress){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "application/xml,text/plain");
        return connect.getInputStream();
}
}
