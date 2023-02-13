public class func{
public void test_getLocalCertificates(){
        URL url = new URL("https:
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.getLocalCertificates();
}
}
