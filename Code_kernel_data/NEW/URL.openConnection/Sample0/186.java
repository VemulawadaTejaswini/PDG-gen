//185
public class func{
	public void testServerStartSequence(){
        server.start();
        waitForStart(server);
        int port = server.httpPort();
        URL url = new URL("http://localhost:" + port + "/test");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        assertThat(connection.getResponseCode()).isEqualTo(404);
}
}
