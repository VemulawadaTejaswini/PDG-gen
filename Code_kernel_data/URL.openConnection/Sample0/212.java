//211
public class func{
	public void isw3OrgReachable(){
            HttpURLConnection connection = (HttpURLConnection) new URL("http://www.w3.org")
                    .openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            connection.disconnect();
}
}
