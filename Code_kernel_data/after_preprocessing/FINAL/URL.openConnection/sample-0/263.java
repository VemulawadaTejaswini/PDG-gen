public class func{
public void getRequest(){
    URL url = new URL("http://localhost:" + RANDOM_SERVER_PORT + "/");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    String result = Util.readToString(connection.getInputStream());
    assertEquals("hello world", result);
}
}
