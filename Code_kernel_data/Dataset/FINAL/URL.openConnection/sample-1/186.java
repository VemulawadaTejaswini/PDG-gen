public class func{
public void test_keystore_in_classpath_google_dot_com(){
        URL url = new URL("https:
        HttpsURLConnection cnn = (HttpsURLConnection) url.openConnection();
        cnn.setSSLSocketFactory(sslSocketFactory);
        int responseCode = cnn.getResponseCode();
}
}
