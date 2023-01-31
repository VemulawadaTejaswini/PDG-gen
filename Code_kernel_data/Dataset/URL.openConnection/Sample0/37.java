//36
public class func{
	public void sendShutdown(){
        URL url = new URL(getServerUrl() + "/shutdown?token=" + _shutdownToken);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.getResponseCode();
            LOG.info("Shutting down " + url + ": " + connection.getResponseCode() + " " + connection.getResponseMessage());
            LOG.debug("Not running");
}
}
