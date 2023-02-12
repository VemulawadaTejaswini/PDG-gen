public class func{
public void check(final String containerId){
        final URL url = new URL("http", dockerHost.address(), port, healthCheck.getPath());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(CONNECT_TIMEOUT_MILLIS);
}
}
