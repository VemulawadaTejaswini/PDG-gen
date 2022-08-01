//66
public class func{
	public void connectionFromUri(String uri){
        URL url = urlFromUri(uri);
            conn = (TDURLConnection) url.openConnection();
            conn.setDoOutput(true);
}
}
