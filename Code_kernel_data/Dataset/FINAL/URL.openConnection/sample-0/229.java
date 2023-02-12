public class func{
public void createConnection(UUID id){
    URL url = new URL(PROFILE_URL + id.toString().replace("-", ""));
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setConnectTimeout(15000);
    connection.setReadTimeout(15000);
    connection.setUseCaches(false);
    connection.setDoInput(true);
    connection.setDoOutput(true);
}
}
