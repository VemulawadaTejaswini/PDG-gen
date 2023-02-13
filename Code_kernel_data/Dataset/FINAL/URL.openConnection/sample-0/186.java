public class func{
public void doWork(){
            URL url = new URL("http:
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            assertThat(connection.getResponseCode()).isEqualTo(200);
}
}
