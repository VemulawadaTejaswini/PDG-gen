public class func{
public void testProxyWithConnectionClose(){
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection(
                server.toProxyAddress());
        connection.setRequestProperty("Connection", "close");
}
}
