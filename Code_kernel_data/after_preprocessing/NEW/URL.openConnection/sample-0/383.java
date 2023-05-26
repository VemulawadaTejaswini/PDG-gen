//383
public class func{
public void verifyHttpResponseCode(int expectedCode,URL url){
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.connect();
    assertEquals(expectedCode, connection.getResponseCode());
}
}
