public class func{
public void isw3OrgReachable(){
            HttpURLConnection connection = (HttpURLConnection) new URL("http:
                    .openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            connection.disconnect();
}
}
