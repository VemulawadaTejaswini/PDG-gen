public class func{
public void testResourceAccessQueryInvalidToken(){
        URL url = new URL(Common.RESOURCE_SERVER + Common.PROTECTED_RESOURCE_QUERY + "?"
            + "oauth_token=randominvalidtoken");
        URLConnection c = url.openConnection();
        if (c instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection)c;
            httpURLConnection.setRequestMethod("GET");

            testInvalidTokenResponse(httpURLConnection);
        }
}
}
