//198
public class func{
	public void test_getCipherSuite(){
        URL url = new URL("https://localhost:55555");
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.getCipherSuite();
}
}
