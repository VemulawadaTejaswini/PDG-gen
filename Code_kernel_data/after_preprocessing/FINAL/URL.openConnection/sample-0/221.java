public class func{
public void invokeServer(String uri){
    URL url = new URL("http:
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    Util.readToString(connection.getInputStream());
}
}
