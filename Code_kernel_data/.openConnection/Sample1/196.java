//195
public class func{
	public void test_selfsigned_certificate(){
        HttpsServer server = getHttpsServer(keyStore, password);
        URL testUrl = new URL("https://127.0.0.1:" + server.getAddress().getPort() + "/");
        HttpsURLConnection cnn = (HttpsURLConnection) testUrl.openConnection();
}
}
