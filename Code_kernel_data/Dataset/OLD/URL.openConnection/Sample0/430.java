//429
public class func{
	public void performGetRequest(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Referer", REFERRER);
            return readFullyAndClose(connection.getInputStream()).trim();
}
}
