//73
public class func{
	public void createConnection(){
    URL url = new URL(PROFILE_URL);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Content-Type", "application/json");
    connection.setConnectTimeout(15000);
    connection.setReadTimeout(15000);
    connection.setUseCaches(false);
    connection.setDoInput(true);
    connection.setDoOutput(true);
}
}
