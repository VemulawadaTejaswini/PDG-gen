//43
public class func{
	public void createConnection(URL url){
    URLConnection connection = url.openConnection();
    connection.addRequestProperty("User-Agent", "HockeySDK/Android");
}
}
