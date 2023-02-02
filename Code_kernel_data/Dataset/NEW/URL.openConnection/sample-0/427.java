//427
public class func{
public void assertResponseCode(int expected,URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            assertEquals(expected, conn.getResponseCode());
            conn.disconnect();
}
}
