//381
public class func{
public void testHelloWorld(){
        URL getUrl = UriBuilder.fromUri(getBaseUri()).path(App.ROOT_PATH).build().toURL();
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "text/plain");
            assertEquals(HttpURLConnection.HTTP_OK, connection.getResponseCode());
            connection.disconnect();
}
}
