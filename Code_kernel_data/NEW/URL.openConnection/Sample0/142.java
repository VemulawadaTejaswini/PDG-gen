//141
public class func{
	public void callPingBack(){
            String pingServerURL = defaultPingBackUrl.concat("-ent");
                url = new URL(pingServerURL);
                urlConn = (HttpURLConnection) url.openConnection();
                urlConn.connect();
                return (HttpURLConnection.HTTP_NOT_FOUND != urlConn.getResponseCode());
}
}
