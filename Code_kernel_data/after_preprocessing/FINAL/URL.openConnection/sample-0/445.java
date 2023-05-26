public class func{
public void getConnectedDownloadConnection(URL downloadURL){
            connection = (HttpURLConnection) downloadURL.openConnection();
            connection.setConnectTimeout(CONNECT_TIMEOUT);
            connection.setReadTimeout(READ_TIMEOUT);
            connection.connect();
}
}
