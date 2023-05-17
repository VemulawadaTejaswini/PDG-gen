//27
public class func{
public void call(){
                URL url = new URL("http://localhost:" + port + "/app/test");
                URLConnection connection = url.openConnection();
                connection.connect();
                return CharStreams.toString(new InputStreamReader(connection.getInputStream()));
}
}
