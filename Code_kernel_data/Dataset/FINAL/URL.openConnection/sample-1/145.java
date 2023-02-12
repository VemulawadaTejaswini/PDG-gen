public class func{
public void testResourceAccessHeaderValidToken(){
        URL url = new URL(Common.RESOURCE_SERVER + Common.PROTECTED_RESOURCE_HEADER);
        URLConnection c = url.openConnection();
        c.addRequestProperty(Common.HEADER_AUTHORIZATION, Common.AUTHORIZATION_HEADER_OAUTH2);
        if (c instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection)c;
            httpURLConnection.setRequestMethod("GET");

            testValidTokenResponse(httpURLConnection);
        }
}
}
