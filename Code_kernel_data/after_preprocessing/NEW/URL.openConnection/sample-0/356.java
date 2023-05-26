//356
public class func{
public void createConnection(final String method,final String testName){
        URL testURL = new URL(createTestUri(testName));
        HttpURLConnection conn = (HttpURLConnection) testURL.openConnection();
}
}
