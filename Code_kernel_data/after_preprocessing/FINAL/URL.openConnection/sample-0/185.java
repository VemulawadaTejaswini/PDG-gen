public class func{
public void testServerStartSequence(){
        server.start();
        waitForStart(server);
        int port = server.httpPort();
        URL url = new URL("http:
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        assertThat(connection.getResponseCode()).isEqualTo(404);
}
}
