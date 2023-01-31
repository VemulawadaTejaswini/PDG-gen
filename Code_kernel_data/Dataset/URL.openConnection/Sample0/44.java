//43
public class func{
	public void testGetAddress(){
        URL url = new URL(getURL() + "/" + "2");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        InputStream xml = connection.getInputStream();
}
}
