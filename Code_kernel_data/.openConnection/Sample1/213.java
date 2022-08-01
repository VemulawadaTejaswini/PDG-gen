//212
public class func{
	public void test_keystore_on_file_system_google_dot_com(){
        URL url = new URL("https://www.google.com");
        HttpsURLConnection cnn = (HttpsURLConnection) url.openConnection();
        cnn.setSSLSocketFactory(sslSocketFactory);
        int responseCode = cnn.getResponseCode();
}
}
