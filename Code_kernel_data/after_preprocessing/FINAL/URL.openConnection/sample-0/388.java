public class func{
public void openConnection(URL url){
            if (logger.isFinestEnabled()) {
                logger.finest("Opening collector connection:" + url);
            }
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLIS);
            connection.setReadTimeout(CONNECTION_TIMEOUT_MILLIS);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestMethod("POST");
}
}
