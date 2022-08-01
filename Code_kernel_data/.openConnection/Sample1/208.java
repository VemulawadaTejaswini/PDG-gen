//207
public class func{
	public void isInternetReachable(){
            URL url = new URL(DL_URL);
            URLConnection openConnection = url.openConnection();
            openConnection.connect();
}
}
