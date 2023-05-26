public class func{
public void getBook(String endpointAddress){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("SpringProxy", "true");
        InputStream in = connect.getInputStream();           
}
}
