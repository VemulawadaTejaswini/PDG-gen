//109
public class func{
public void testGet(@ArquillianResource URL url){
        URL testURL = new URL(url, "simple");
        HttpURLConnection conn = (HttpURLConnection) testURL.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.setDoOutput(false);
        conn.connect();
}
}
