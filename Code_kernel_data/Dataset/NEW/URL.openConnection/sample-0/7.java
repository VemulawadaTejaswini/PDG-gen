//7
public class func{
public void dispatchRequest(String argURL){
            URL url = new URL(argURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            connection.setRequestProperty("Cache-Control", "no-transform");
            connection.setRequestMethod("GET");
            connection.setInstanceFollowRedirects(true);
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                Logger.logError("JGoogleAnalyticsTracker: Error requesting url '{}', received response code {}" + argURL + responseCode);
            }
            Logger.logDebug("Error making tracking request", e);
}
}
