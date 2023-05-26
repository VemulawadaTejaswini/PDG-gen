public class func{
public void getRequest(){
    URL url = new URL("http:
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    String result = Util.readToString(connection.getInputStream());
    assertEquals("hello world", result);
}
}
