//270
public class func{
	public void getConnection(String path){
        logger.log(Level.INFO, "sending request to {0}", path);
        URL url = new URL("http", "localhost", PORT, path);
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        urlConn.connect();
}
}
