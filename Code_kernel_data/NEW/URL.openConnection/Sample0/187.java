//186
public class func{
	public void doWork(){
            URL url = new URL("http://localhost:" + port + "/?id=" + id);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            assertThat(connection.getResponseCode()).isEqualTo(200);
}
}
