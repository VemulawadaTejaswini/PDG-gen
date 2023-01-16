//191
public class func{
	public void isInternetReachable(String address){
            URL url = new URL(address);
            URLConnection connection = url.openConnection();
            connection.connect();
}
}
