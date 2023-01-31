//238
public class func{
	public void getBook(String endpointAddress,String resource,String type,String mHeader){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept-Encoding", "gzip;q=1.0, identity; q=0.5, *;q=0");
}
}
