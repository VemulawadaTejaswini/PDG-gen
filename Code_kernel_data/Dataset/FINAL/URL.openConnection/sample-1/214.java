public class func{
public void doClient(){
        InetSocketAddress address = httpsServer.getAddress();
        URL url = new URL("https://localhost:" + address.getPort() + "/");
        HttpsURLConnection uc = (HttpsURLConnection) url.openConnection();
}
}
