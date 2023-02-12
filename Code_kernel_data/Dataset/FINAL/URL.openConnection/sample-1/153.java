public class func{
public void testResourceAccessQueryNoToken(){
        URL url = new URL(Common.RESOURCE_SERVER + Common.PROTECTED_RESOURCE_QUERY);
        URLConnection c = url.openConnection();
        if (c instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection)c;
            httpURLConnection.setRequestMethod("GET");

            testNoTokenResponse(httpURLConnection);
        }
}
}
