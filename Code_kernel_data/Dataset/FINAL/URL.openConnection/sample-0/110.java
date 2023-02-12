public class func{
public void testDoPost(){
        url=new URL("http://127.0.0.1:"+connector.getLocalPort()+"/test/dump/info?query=foo");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.addRequestProperty(HttpHeaders.CONTENT_LENGTH, "10");
}
}
