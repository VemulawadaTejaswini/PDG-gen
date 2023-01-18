//49
public class func{
	public void verifyHelperForPostPutJSON(int id){
        URL url = new URL(getURL() + "/" + id);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        InputStream inputStream = connection.getInputStream();
        StreamSource json = new StreamSource(inputStream);
}
}
