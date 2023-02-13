public class func{
public void httpGet(int port,String path){
    URL url = new URL("http:
    URLConnection conn = url.openConnection();
    Reader reader = new InputStreamReader(conn.getInputStream());
    String response = CharStreams.toString(reader);
    reader.close();
}
}
